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

    public void eatIt() {
        System.out.print("Yum yum yum! Thank goodness there's no fish in this\n\n");
    }

    public void denyIt() {
        System.out.print("Yeah, I don't think I'm going to be eating today.\n\n");
    }

    public void weirdCombo() {
        System.out.print("Wait a minute you're telling me theres fish and meat in this dish? I'm calling the police!\n\n");
    }
}
//complete //