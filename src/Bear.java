public class Bear extends Animal{

    String name;
    String favoriteFood;

    public Bear(String name){
        super(name, "fish");
    }
//    public void eat(String food){
//        System.out.println(name + " eats " + food);
//        if (food.equals(favoriteFood)){
//            System.out.println("YUM!!!" + name + " wants more " + food);
//        }
//        else{
//            sleep();
//        }
//    }

    public void sleep(){
        System.out.println(super.name + " hibernates for 4 months");
    }


}
