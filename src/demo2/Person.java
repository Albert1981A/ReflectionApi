package demo2;

import java.util.Objects;

public class Person implements FoodInfo, HealthInfo{

    private int id;
    private String name;
    private float weight;

    public Person() {
        System.out.println("Empty CTOR in action");
    }

    public Person(String name, float weight) {
        this.name = name;
        this.weight = weight;
        System.out.println("Partial CTOR in action");
    }

    public Person(int id, String name, float weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        System.out.println("Full CTOR in action");
    }

    @Override
    public void whatsForDinner() {
        System.out.println("Pizza");
    }

    @Override
    public boolean isVaccinated() {
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Float.compare(person.weight, weight) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight);
    }
}
