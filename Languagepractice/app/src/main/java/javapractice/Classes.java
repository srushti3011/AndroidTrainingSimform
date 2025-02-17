package javapractice;

class Cars {
    int modelNo;
    int weight;
    Cars(int modelNo, int weight) {
        this.modelNo = modelNo;
        this.weight = weight;
    }
    void display() {
        System.out.println("Model No. : " + this.modelNo + " Model weight: " +this.weight);
    }
}

class Toyata extends Cars {
    String name;
    Toyata(int model, int weight, String name) {
        super(model, weight);
        this.name = name;
    }
    void display() {
        System.out.println("Display method of Toyota");
    }
    void toyotaMethod() {
        System.out.println("This method belongs to Toyata class");
    }
}

class Classes {
    public static void main(String[] args) {
        Cars carOne = new Cars(1, 700);
        carOne.display();

        Cars carTwo = new Toyata(2, 900, "Liva"); //upcasting
        carTwo.display();
        Toyata toyataOne = new Toyata(3, 800, "Innova");
        System.out.println(toyataOne instanceof Cars);
    }
}