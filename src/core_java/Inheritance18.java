package core_java;
public class Inheritance18 {
    public static void main(String[] args) {
        AppleFruit apple = new AppleFruit("Apple", "Green", "Sour", "Small");
        BananaFruit banana = new BananaFruit("Banana", "Yellow", "Sweet", "Medium");

        System.out.println("Apple: " + apple.name + ", Color: " + apple.color + ", Taste: " + apple.taste + ", Size: " + apple.size);
        System.out.println("Banana: " + banana.name + ", Color: " + banana.color + ", Taste: " + banana.taste + ", Size: " + banana.size);
    }
}

