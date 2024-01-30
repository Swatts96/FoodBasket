public class Food {
boolean meat;
boolean fruit;
boolean fish;
boolean vegetable;
boolean bread;
    public Food(boolean meat, boolean fruit, boolean fish, boolean vegetable, boolean bread) {
        this.meat = meat;
        this.fruit = fruit;
        this.fish = fish;
        this.vegetable = vegetable;
        this.bread = bread;
    }


    public static class foodBasket {
        Food[] meal ;
    }

    public void eatIt() {
        System.out.println("Yum yum yum, this " + this.toString() + " is sooooooo good. Thank goodness" +
                " it isn't that other food I don't like.");
    }

    public void denyIt() {
        System.out.println("Yeah, I don't think I'm going to be eating " + this.toString() + " today.");
    }
}
