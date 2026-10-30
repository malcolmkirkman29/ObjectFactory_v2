public class Factory {

    //Instance variables
    //Always use public
    public boolean isOpen = true;
    public int yearFounded = 2026;

    public String newVariable = "This is a variable :3";

    //New variable type: String
    //Holds words, punctuation, sentences
    public String owner = "Max";

    //Special variable called an object
    //Objects are made from classes we create
    //Objects are the house, classes are the blueprints
    public Pumpkin pumpkin1;
    public Pumpkin pumpkin2;
    public Pumpkin pumpkin3;

    public Manatee manatee1;

    public int randomSize;

    public static void main(String[] args) {
        Factory a = new Factory();
    }

    //Special method: constructor
    public Factory(){
        //Factory
        System.out.println("Welcome to Max's Factory >:)");
        System.out.println("The year founded is...");
        System.out.println(yearFounded);
        System.out.println("It is " + isOpen + " that the factory is open.");
        System.out.println("The owner is " + owner + ".");
        System.out.println();

        //Pumpkin 1
        pumpkin1 = new Pumpkin(10, "orange", false);
        pumpkin1.printInfo();

        pumpkin1.color = "blue";
        System.out.println("Now the pumpkin's color is " + pumpkin1.color + ".");
        System.out.println();

        //Pumpkin 2
        randomSize = ((int)(Math.random() * 30))+1; //range 1-30
        pumpkin2 = new Pumpkin(randomSize, "white", true);
        pumpkin2.printInfo();
        System.out.println();

        //Pumpkin 3
        pumpkin3 = new Pumpkin(13, "rainbow", true);
        pumpkin3.printInfo();
        System.out.println();

        //Manatee 1
        manatee1 = new Manatee(true, 71, "Romeo", "iceburg lettuce");
        manatee1.printInfo();
        System.out.println("Romeo is the oldest manatee to ever live!");

    }
}