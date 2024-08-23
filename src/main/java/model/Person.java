package model;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String cc;

    public Person(String name, int age, String cc) {
        this.name = name;
        this.age = age;
        this.cc = cc;
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

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cc='" + cc + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //Primer criterio de comparacion
        int difference =this.age - o.getAge();
        //Segundo criterio de comparacion
        if (difference == 0) {
            difference=this.name.compareTo(o.getName());
        }
        //Resultado de la comparacion
        return this.age - o.getAge();
    }
}
