public class Tiger extends Animal {

    String name;
    String favoriteFood;

    public Tiger(String name){
        super(name, "meat");
    }

    public void sleep(){
        System.out.println(name + " sleeps for 8 hours");
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

}
