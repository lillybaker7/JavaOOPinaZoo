public class Unicorn extends Animal{

    String name;
    String favoriteFood;

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(){
        System.out.println(super.name + " sleeps in a cloud.");
    }


}
