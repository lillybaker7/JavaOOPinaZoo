public class Runner {
    public static void main(String[] args) {
        Animal tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Animal pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Animal rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Animal gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        Animal stinger = new Bee("Stinger");
        stinger.eat("pollen");
        stinger.sleep();
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "Chicken Tikka Masala");
    }
}
