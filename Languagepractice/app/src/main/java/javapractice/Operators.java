package javapractice;

class Operators {
    public static void main(String[] args) {
        System.out.println(5 + 10);
        System.out.println(5 * 10);
        System.out.println(5 / 10.0);
        System.out.println(5 - 10);

        int incIt = 20;
        incIt++;
        System.out.println(incIt);
        System.out.println(incIt++);
        System.out.println(++incIt);

        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println(~5);

        int numOne = 9;
        int numTwo = 20;
        System.out.println(numTwo==0 && numTwo==0);
        System.out.println(numTwo==0 || numTwo==0);
        System.out.println(numTwo != numOne);

        int valFromTernary = numOne == 9 ? 9 : 2;
        System.out.println(valFromTernary);
    }
}