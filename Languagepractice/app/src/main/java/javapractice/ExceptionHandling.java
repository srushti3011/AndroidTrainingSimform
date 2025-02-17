package javapractice;
class VerifyAge extends Exception {
    public VerifyAge(String message) {
        super(message);
    }
}
class ExceptionHandling {
    static void CheckAge(int age) throws VerifyAge {
        try {
            if(age<18) {
                throw new VerifyAge("You can't drive");
            } else {
                System.out.println("You can drive");
            }
        } finally {
            System.out.println("done");
        }
    }
    static void checkString(String str) throws NullPointerException {
        if (str == null) {
            throw new NullPointerException("Null Pointer Exception raised");
        }
    }
    public static void main(String[] args) {
        int age = 15;
        try {
            CheckAge(age);
        } catch (Exception e) {
            System.out.println("Got exception " + e.getMessage());
        }
        System.out.println("User defined Exception done ----------");

        int nums[] = {1,2,3,5,7,10};
        String str = null;
        try {
            System.out.println(nums[3]);
            System.out.println(str.length());
        } catch(IndexOutOfBoundsException iofb) {
            System.out.println(iofb.getMessage());
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
        ExceptionHandling.checkString("hello");
        System.out.println("Execptions completed");
    }
}