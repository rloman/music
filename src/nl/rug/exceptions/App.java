package nl.rug.exceptions;

public class App {

    // Twee types exception: 1) Checked exception, 2) Unchecked exception
    // 1 => Ik moet een try catch block maken
    // 2 => Ik MAG een try catch block maken
    public static void main(String[] args) throws DuoRugException /* <= declare */ {

        // try catch block is handle, dus ... Handle or Declare ... (bij een checked exception)
        try {
            System.out.println(divide(5, 0));
        }
        catch(ArithmeticException | DuoRugException e ) {

        } catch (Exception e) {
            e.printStackTrace();
        }


        /*
        catch (DuoRugException dre) {
            dre.printStackTrace();
        }
        catch(ArithmeticException are) {
            are.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

         */

        System.out.println("Einde programma");
    }

    public static int divide(int n, int m) throws DuoRugException, Exception, ArithmeticException {

        if (m == 0) {
            throw new DuoRugException();
        }

        return n / m;
    }
}

// checked exception
class DuoRugException extends Exception { // checked, want erft inDIRECT of RECHTSTREEKS van java.lang.Exception

}

// unchecked exception
class DuoRugUncheckedException extends RuntimeException {// unchecked, want erft DIRECT / RECHTSTREEKS van java.lang.RuntimeException

}
