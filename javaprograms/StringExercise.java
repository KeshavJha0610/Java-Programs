package javaprograms;

public class StringExercise {

    public static void main(String[] args) {

        String str = "apple";
        String npt = "banana";
        String str1 = "apple";
        String str2 = new String("apple");

        System.out.println(str == str1);//true
        System.out.println(str == str2);//false
        System.out.println(str.equals(str2));//true
        System.out.println(str == npt);//false
    }
}


