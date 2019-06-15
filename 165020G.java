/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nondupordarray;

/**
 *
 * @author Student
 */
public class NonDupOrdArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NonDupOrdArrayapp n = new NonDupOrdArrayapp(7);
        n.insert(5);
        n.insert(18);
        n.insert(31);
        n.insert(4);
        n.insert(1);
        n.insert(8);
        n.insert(11);
        n.display();
        n.delete(11);
        System.out.println("After deleting 11 from Array");
        n.display();
    }
    
}

class NonDupOrdArrayapp {
         private long[] a;
         private int nElements;
         public NonDupOrdArrayapp(int max){
         this.a = new long[max];
}
          public int size() {
        return a.length;
    }
            public int find(long searchKey) {
        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] == searchKey) {
                return 1;
            }
        }
        return 0;
    }
public void insert(long value){
    long temp;
    if (this.nElements == this.a.length) {
            System.out.println("Array size is maximum");
    }
    else{
        if (this.find(value) == 0) {
                this.a[nElements] = value;
                this.nElements++;
    }
        else{
            System.out.println("Element is already is exiats");
        } 
        for (int i = 0; i < this.nElements - 1; i++) {
                for (int j = i + 1; j < this.nElements; j++) {

                    if (this.a[i] > a[j]) {
                        temp = this.a[i];

                        this.a[i] = this.a[j];
                        this.a[j] = temp;

                    }
                }
        }
    }
            
} 

public boolean delete(long value) {

        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] == value) {
                nElements--;
                for (int j = i; j < this.nElements; j++) {
                    if (nElements == 0) {
                        System.out.print("No array Elements is here\n");
                        return true;
                    } else {
                        a[j] = a[j + 1];
                    }
                }
                return true;
            }
        }

        return false;
    }
    public void display() {
        for (int i = 0; i < this.nElements; i++) {
            System.out.print(this.a[i] + " ");
        }
    }
}