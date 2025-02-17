package javapractice;

class Enums{
    enum Building {
        FLATIRON("USA"){
            @Override
            public void describe() {
                System.out.println(this.getCountry());
            }
        },
        CNTOWER("Canada") {
            @Override
            public void describe() {
                System.out.println(this.getCountry() + " is the country where " + this.toString() + " is situated");
            }
        };
        private String country;
        Building(String country) {
            this.country = country;
        }
        String getCountry() {
            return this.country;
        }
        public abstract void describe();
    }

    enum Season {
        WINTER,
        MONSOON,
        SUMMER; // enum constructor would be called here also

        Season() {
            System.out.println("Enum constructor");
        }
    }

    public static void main(String[] args) {
        Season seasonOne = Season.SUMMER;

        for(Season curr: Season.values()) {
            System.out.println(curr);
        }
        System.out.println(seasonOne.toString());
        System.out.println(seasonOne.ordinal());

        Building buildingOne = Building.CNTOWER;
        System.out.println(buildingOne.country);
        buildingOne.describe();
    }
}