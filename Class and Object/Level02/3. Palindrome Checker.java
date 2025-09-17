package com.bridgelabz.oops.leveltwo;

class Palindrome {
    String text;

    Palindrome(String t) {
        text = t;
    }

    boolean isPalindrome() {
        String s = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    void result() {
        System.out.println(text + " -> " + (isPalindrome() ? "Palindrome" : "Not Palindrome"));
    }

    public static void main(String[] args) {
        Palindrome p1 = new Palindrome("Madam");
        Palindrome p2 = new Palindrome("Hello World");
        p1.result();
        p2.result();
    }
}
