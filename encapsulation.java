package EncapsulationPractise;

public class encapsulation {
   private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        encapsulation en =new encapsulation();
        en.setAge(05);
        en.setName("mehar");
        System.out.println(en.getAge());
        System.out.println(en.getName());
    }
}
