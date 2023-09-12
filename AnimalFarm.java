import java.util.ArrayList;


public class AnimalFarm {
    private ArrayList<Animal> animals = new ArrayList<>();

    // 새로운 동물을 동물농장에 추가하는 메서드
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // 이름으로 동물 객체를 찾아 반환하는 메서드
    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null; // 동물이 없을 경우
    }

    // 농장 안에 있는 모든 동물에게 소리를 내도록 하는 메서드
    public void makeAllAnimalsSpeak() {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    // 농장 안에 있는 모든 동물의 이름/무게/색깔을 출력하는 메서드
    public void printAllAnimalDetails() {
        System.out.println("|    이름     |   무게 (kg) |    색깔   |");
        System.out.println("|------------|-------------|----------|");

        // 모든 동물의 정보를 표 형식으로 출력합니다.
        for (Animal animal : animals) {
            String name = animal.getName();
            double weight = animal.getWeight();
            String color = animal.getColor();

            // 표 형식으로 출력
            System.out.printf("| %-10s | %-11.2f | %-8s |\n", name, weight, color);
        }

        // 표의 바닥을 출력합니다.
        System.out.println("|------------|-------------|----------|");
    }
}
