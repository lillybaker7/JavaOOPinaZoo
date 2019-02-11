public class Giraffe extends Animal{

    String name;
    String favoriteFood;

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food){
        System.out.println(super.name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println("YUM!!!" + super.name + " wants more " + food);
        }
        else{
            System.out.println("YUCK!!! " + super.name + " will not eat " + food);
        }
    }

}
