import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;
import shape.Circle;
import shape.Rectangle;
import shape.Resizeable;
import shape.Square;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }

        Resizeable [] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Square(20);
        System.out.println("Before changed:");
        for (Resizeable shape: shapes) {
            System.out.println(shape);
        }
        System.out.println("After changed:");
        for (Resizeable shape: shapes) {
            shape.resize(1.5);
            System.out.println(shape);
        }
    }
}
