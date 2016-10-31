
/**
 * Created by Thanh Product on 10/30/2016.
 */
public class Person {
    private static String name;
    private int age;
    private float weight;

    /// contructor

    public  Person(String name, int age, float weight) {
        this.name = name;
        this.age=age;
        this.weight=weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString() {
        return name + " " + age + " " + weight;
    }


    public static void main(String[] args) {
        Person p = new Person("Phung", 23, 52.5f);
        System.out.println(p);
        System.out.println("Tên "+ p.getName());
        System.out.println("Tuổi "+ p.getAge());
        System.out.println("Cân Năng "+p.getWeight());

        Person p1 = new Person("obama",40,60);
        System.out.println(p1);
    }
}