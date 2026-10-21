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

        //Pumpkin 1
        pumpkin1 = new Pumpkin();
        System.out.println("The pumpkin's color is " + pumpkin1.color + ".");
        System.out.println("The pumpkin is " + pumpkin1.pumpkinSize + " feet wide.");
        System.out.println("It is " + pumpkin1.isAJackolantern + " that the pumpkin is a Jack 'o lantern.");

        pumpkin1.color = "blue";
        System.out.println("Now the pumpkin's color is " + pumpkin1.color + ".");

        //Pumpkin 2
        pumpkin2 = new Pumpkin();
        pumpkin2.color = "white";
        pumpkin2.pumpkinSize = 5;
        pumpkin2.isAJackolantern = true;

        System.out.println("The second pumpkin's color is " + pumpkin2.color + ".");
        System.out.println("The second pumpkin is " + pumpkin2.pumpkinSize + " feet wide.");
        System.out.println("It is " + pumpkin2.isAJackolantern + " that the second pumpkin is a Jack 'o lantern.");

        //Pumpkin 3
        pumpkin3 = new Pumpkin();
        pumpkin3.color = "rainbow";
        pumpkin3.pumpkinSize = 13;
        pumpkin3.isAJackolantern = true;

        System.out.println("The third pumpkin's color is " + pumpkin3.color + ".");
        System.out.println("The third pumpkin is " + pumpkin3.pumpkinSize + " feet wide.");
        System.out.println("It is " + pumpkin3.isAJackolantern + " that the third pumpkin is a Jack 'o lantern.");

    }
}