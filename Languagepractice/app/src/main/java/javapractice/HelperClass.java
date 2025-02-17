package javapractice;

class PrintContent {
    public static void print(String str) {
        System.out.println(str);
    }
    public static void print(int str) {
        String temp = new String(String.valueOf(str));
        System.out.println(temp);
    }
}

class HelperClass {
    public static void main(String[] args) {
        PrintContent.print("hello");
        PrintContent.print(5);
    }
}