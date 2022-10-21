package com.dsa.String;

public class StringBuilders {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Kamlesh");
//        System.out.println(sb);
//
//        // char at index 0
//        System.out.println(sb.charAt(0));
//
//        // set char at index 0
//        sb.setCharAt(0,'L');
//        System.out.println(sb);
//
//        // insert char at index 0
//        sb.insert(0,'M');
//        System.out.println(sb);
//
//        // insert char at index 4
//        sb.insert(4,'l');
//        System.out.println(sb);
//
//        // delete the extra l
//        sb.delete(4,5) ;
//        sb.delete(0,2);
//        sb.insert(0,'K');
//        System.out.println(sb);
//
//        // append funtion
//        StringBuilder name = new StringBuilder("H");
//        name.append("e");
//        name.append("l");
//        name.append("l");
//        name.append("o");
//
//        System.out.println(name);

        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;  // 5-1-0 => 4
            // find front char
            char fronChar = sb.charAt(front);
            // find back char
            char backChar = sb.charAt(back);

            // replace front to backChar
            sb.setCharAt(front, backChar); 
            // replace back to frontChar
            sb.setCharAt(back, fronChar);
        }
        System.out.println(sb);
    }
}
