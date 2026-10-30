public class Manatee {

    //Instance variables
    public boolean isMale;
    public int age;
    public String name;
    public String favoriteFood;

    public Manatee(boolean pIsMale, int pAge, String pName, String pFavoriteFood){
        isMale = pIsMale;
        age = pAge;
        name = pName;
        favoriteFood = pFavoriteFood;
    }

    public void printInfo(){
        System.out.println("It is " + isMale + " that " + name + " is male.");
        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + "'s favorite food is " + favoriteFood + ".");
    }
}
