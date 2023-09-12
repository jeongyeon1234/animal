public class Main {
    public static void main(String[] args) {
        // AnimalFarm 객체 생성
        AnimalFarm farm = new AnimalFarm();

        // 동물 객체 생성 및 추가
        Animal dog = new Dog("강아지1", 20.5, "갈색");
        Animal cat = new Cat("고양이1", 7.2, "회색");
        Animal chicken = new Chicken("닭1", 1.5, "흰색");

        farm.addAnimal(dog);
        farm.addAnimal(cat);
        farm.addAnimal(chicken);

        // 이름으로 동물 찾기
        Animal foundAnimal = farm.findAnimalByName("강아지1");
        if (foundAnimal != null) {
            System.out.println("검색: " + foundAnimal.getName());
        } else {
            System.out.println("동물을 찾지 못했습니다.");
        }

        // 모든 동물 소리내기
        System.out.println("모든 동물이 짖습니다:");
        farm.makeAllAnimalsSpeak();

        // 모든 동물 정보 출력
        System.out.println("모든 동물 정보 출력:");
        farm.printAllAnimalDetails();
    }
}
