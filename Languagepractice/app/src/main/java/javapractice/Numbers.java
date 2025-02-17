package javapractice;//import com.android.tools.r8.internal.Sy;

class Numbers {
    int num1;
    int num2;
    Numbers(int numOne, int numTwo) {
        this.num1 = numOne;
        this.num2 = numTwo;
    }
    void display(int num1) {
        System.out.println(num1);
    }
    void display(int num1, int num2) {
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        Numbers num1 = new Numbers(5,10);
        num1.display(num1.num1);
        num1.display(num1.num1, num1.num2);
        System.out.println(num1 instanceof Numbers);
    }
}