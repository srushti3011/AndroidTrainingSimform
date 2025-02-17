package javapractice;

class ControlFlow {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
        int m = 2;
        while(m<10) {
            System.out.println(m);
            if(m==4) {
                break;
            }
            m++;
        }
        System.out.println("loop completed" + m);
        while(m<9) {
            System.out.println(m);
            m++;
            if(m==5) {
                continue;
            }
        }

        int checkVal = 40;
        do {
            System.out.println("ok");
        } while(checkVal != 40);

        outer: for(int i = 0; i <= 10; i++) {
            for(int j = 0; j <= 10; j++) {
                System.out.println(i + " " + j);
                if(i == 2 && j == 2) {
                    break outer;
                }
            }
        }

        String day = "Monday";
        if(day == "Monday") {
            System.out.println("Today is " + day);
        } else if(day == "Tuesday") {
            System.out.println("Today is" + day);
        } else {
            System.out.println("Some other day");
        }

        switch(day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}