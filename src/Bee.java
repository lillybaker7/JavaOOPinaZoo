public class Bee extends Animal{

    String name;
    String favoriteFood;

    public Bee(String name){
        super(name, "pollen");
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

    public void sleep(){
        System.out.println(super.name + " never sleeps");
    }


}
