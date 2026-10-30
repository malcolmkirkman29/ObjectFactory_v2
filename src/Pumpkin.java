public class Pumpkin {
    //A class is like blueprints that will make things

    //Instance variables
    //  Color
    //  Size
    //  Is a jack o'lantern
    //todo: turn ideas into variables

    public String color;
    public int pumpkinSize;
    public boolean isAJackolantern;

    //Special method constructor
    //Name has to match the class name
    //Do not use void
    public Pumpkin(int pSize, String pColor, boolean pJackolantern){
        color = "orange";
        pumpkinSize = pSize;
        isAJackolantern = false;
    }

    //todo: make a method called printInfo()

    public void printInfo(){
        System.out.println("The pumpkin's color is " + color + ".");
        System.out.println("The pumpkin is " + pumpkinSize + " feet wide.");
        System.out.println("It is " + isAJackolantern + " that the pumpkin is a Jack 'o lantern.");
    }
}
