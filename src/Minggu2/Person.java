package Minggu2;
public class Person {
    String personName;
    int personAge;
    public Person(String name, int age){
        this.personName=name;
        this.personAge=age;
    }
    public String getName(){
        return this.personName;
    }
    public int getAge(){
        return this.personAge;
    }
    public void setAge(int age){
        this.personAge=age;
    }
}