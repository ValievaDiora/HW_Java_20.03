import javax.xml.namespace.QName;

public class Planet {
    public int numberOfMoons;
    public String name;

    Planet() {
        System.out.println("Это пустой конструктор.");
    }

    Planet(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
        System.out.println("Этот конструктор записывает только количество лун: " + this.numberOfMoons);

    }
        Planet(String name) {
        this.name = name;
            System.out.println("Этот конструктор записывает только название" + "Я - планета " + this.name);

    }

    Planet(int numberOfMoons, String name) {
        this.numberOfMoons = numberOfMoons;
        this.name = name;
        System.out.println("Я - планета " + this.name + ". У меня " + numberOfMoons + " лун.");

    }

}