package nl.rug.designpatterns.composite;

public class Tree {

    private Integer value;

    private Tree left;
    private Tree right;

    public void add(int n) {
        if(this.value == null) {
            this.value = n;

            left = new Tree();
            right = new Tree();
        }
        else {
            if(n < this.value) {
                left.add(n);
            }
            else {
                right.add(n);
            }
        }
    }

    // exercise
    // add

    public int getSize() {

        return 333;
    }


    public void print() {
       if(value != null) {
           left.print();
           System.out.print(value+", ");
           right.print();
       }
    }
}
