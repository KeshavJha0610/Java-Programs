package javacoreprograms;

public class EvenOddFromArray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Even numbers in array........");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }
        System.out.println("Even numbers in array........");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}




