package core_java;
class FruitItem {
    String name;
    String color;

    FruitItem(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class AppleFruit extends FruitItem {
    String taste;
    String size;

    AppleFruit(String name, String color, String taste, String size) {
        super(name, color);
        this.taste = taste;
        this.size = size;
    }
}

class BananaFruit extends FruitItem {
    String taste;
    String size;

    BananaFruit(String name, String color, String taste, String size) {
        super(name, color);
        this.taste = taste;
        this.size = size;
    }
}

public class Inheritance17 {
    public static void main(String[] args) {
        AppleFruit apple = new AppleFruit("Apple", "Red", "Sweet", "Medium");
        BananaFruit banana = new BananaFruit("Banana", "Yellow", "Sweet", "Large");

        System.out.println("Apple: " + apple.name + ", Color: " + apple.color + ", Taste: " + apple.taste + ", Size: " + apple.size);
        System.out.println("Banana: " + banana.name + ", Color: " + banana.color + ", Taste: " + banana.taste + ", Size: " + banana.size);
    }
}
