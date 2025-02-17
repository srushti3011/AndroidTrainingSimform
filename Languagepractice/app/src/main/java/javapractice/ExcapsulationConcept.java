package javapractice;

class Details {
    private String name;
    private int age;
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
}

class ReadOnly {
    private String propertyOne = "This is the first property";
    String getPropertyOne() {
        return this.propertyOne;
    }
}

class WriteOnly {
    private String onlyAllowedToWrite;
    void setOnlyAllowedToWrite(String val) {
        this.onlyAllowedToWrite = val;
    }
}

class ExcapsulationConcept {
    public static void main(String[] args) {
        Details detailsOne = new Details();
        detailsOne.setName("Abcd");
        detailsOne.setAge(25);
        System.out.println(detailsOne.getName() + " " + detailsOne.getAge());

        ReadOnly readOnlyInstanceOne = new ReadOnly();
        System.out.println(readOnlyInstanceOne.getPropertyOne());

        WriteOnly writeOnlyInst = new WriteOnly();
        writeOnlyInst.setOnlyAllowedToWrite("Property can only be written");
    }
}
