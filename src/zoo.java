public class zoo {

    String favoriteFood = "bacon";

//    public static void main(String[] args){
//        zoo z = new zoo();
//        z.sleep("Tigger");
//        z.eat("Tigger", "meat");
//        z.eat("Tigger", "bacon");
//
//    }

    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }


    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println("YUM!!!" + name + " wants more " + food);
        }
    }

}
