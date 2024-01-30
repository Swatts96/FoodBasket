public class Main {
    public static void main(String[] args) {
        Food[] picnicBasket = {
                new Food(true, false, false, true, false), // meat, vegetable
                new Food(false, true, true, false, false), // fruit, fish
                new Food(false, false, false, true, true), // vegetable, bread
                new Food(true, false, true, true, true)  // vegetable, bread
        };

        for (Food food : picnicBasket) {
            if (food.fish && food.meat) {
                food.denyIt();
            } else if (food.fish ){
                food.denyIt();
            } else {
                food.eatIt();
            }
        }
    }
}

// n the Food class, define properties/methods for:
// The food’s name, and type (ie. Meat, vegetable, dairy, etc).
// A constructor method.
// Method eatIt(), returns a String message, indicating you just ate the food.
// Ex. “You just ate the banana.”
// Method denyIt(), returns a String message, indicating you won’t eat this type of
// food.
// Ex. “Not eating that! I hate vegetables!”
// In your Main class, create at least three instances of your Food class, and add them all to an object array called picnicBasket.
// Write code to go through each food in your picnic basket, one at a time.
// Write a conditional statement to decide, per item, whether to call either the eatIt() or
// denyIt() method, depending on the food type of the current object. (Your choice of logic)
// For example, if you hate veggies, make your code call denyIt() if the food’s type is
// vegetable.
// In-class Exercise 1: Food
// Basket