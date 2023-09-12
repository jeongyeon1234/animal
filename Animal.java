public class Animal {
    private String name;
    private double weight;
    private String color;

    public Animal(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void speak() {
        // 각 동물의 소리 출력 로직을 구현
        if (this instanceof Dog) {
            System.out.println(name + " 멍멍!");
        } else if (this instanceof Cat) {
            System.out.println(name + " 야옹!");
        } else if (this instanceof Chicken) {
            System.out.println(name + " 꼬끼오!");
        }
    }
}