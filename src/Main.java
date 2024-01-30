public class Main {
    public static void main(String[] args) {
        Food[] picnicBasket = {
                new Food(false, true, true, false, false), // fruit, fish
                new Food(false, false, false, true, true), // vegetable, bread
                new Food(true, false, true, true, true)  // vegetable, bread
        };

        for (Food food : picnicBasket) {
            if (food.fish && food.meat) {
                food.weirdCombo();
            } else if (food.fish ){
                food.denyIt();
            } else {
                food.eatIt();
            }
        }
    }
}
