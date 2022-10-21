package com.dsa.String;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define String
//        String name = "Piyush";
//        String fullname = "Piyush Singh";
//        String sentence = "I'm Piyush Singh";
//        System.out.println(name);
//        System.out.println(fullname);
//        System.out.println(sentence);

        // User defined String
//        System.out.println("Enter your name:");
//        String name = sc.next();
//        System.out.println("Enter your Fullname:");
//        String fullname = sc.nextLine();
//        fullname = sc.nextLine();
//        System.out.println("Type a sentence:");
//        String sentence = sc.nextLine();
//
//        System.out.println(name);
//        System.out.println(fullname);
//        System.out.println(sentence);
//        System.out.println(name.length());
//        for(int i=0; i<name.length();i++){
//            System.out.println(name.charAt(i));
//        }
//        String name = "Kamlesh";
//        String name1 = "Kamlesh Lovewanshi";
//        if(name.compareTo(name1)<name1.compareTo(name)){
////            System.out.println("Equal");
//            System.out.println("Greater");
//        }
//        else{
////            System.out.println("Not equal");
//            System.out.println("Lesser");
//        }

        String sentence = "My name is Piyush";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
