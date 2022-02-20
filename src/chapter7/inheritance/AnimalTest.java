package chapter7.inheritance;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void readBook() {}

    public void hunting() {}

    public void flying() {}

}

class Human extends Animal{
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    @Override
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    @Override
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    @Override
    public void flying() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();
        animal.readBook();
        animal.hunting();
        animal.flying();
    }
}
