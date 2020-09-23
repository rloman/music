package nl.rug.strings;

public class App {

    public static void main(String[] args) {

        String one = "1";
        String two = "2";

        String oneTwo = one+two;

        System.out.println(oneTwo);

        System.out.println("Het resulaat van 1+5 is: "+(1+5));


        String firstName = "Frank";

        System.out.println(firstName.charAt(1));

        String zin = "The quick brown fox jumps over the lazy dog";

        int foxIndex = zin.indexOf("fox");
        if(foxIndex == 16) {
            //ok
        }
        else {
            System.out.println("Fout");
        }

        foxIndex = zin.indexOf("Poedel");

        if(foxIndex == -2) {
            //ok
        }
        else {
            System.out.println("Fout");
        }

        String paashaas = "   paashaas        ".trim().toUpperCase().replace("A", "E");

        System.out.println(">"+paashaas+"<");

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for(char current = 'a';current <= 'z';current++) {
            stringBuilder.append(current);
        }
        stringBuilder.reverse();
        stringBuilder.delete(3,5);
        stringBuilder.insert(0, 'Q');

        String alpha = stringBuilder.toString();

        System.out.println(alpha);
        String name = "raymond loman";
        StringBuilder builder = new StringBuilder(name);
        builder.setCharAt(0, 'R');
        builder.setCharAt(name.indexOf('l'), 'L'); // :-)
        builder.reverse();

        System.out.println(builder);

        String computer =  "Computer";


        StringBuilder b = new StringBuilder();
        b.append("Computer");

        String computer2 = b.toString();

        System.out.println(computer == computer2);
        if(computer != null) {
            System.out.println(computer.equals(computer2));
        }

        computer2 = null;
        System.out.println("Computer".equals(computer2));



        String first = "Marte";
        String second = "Marte";

        System.out.println(first == second);


    }
}
