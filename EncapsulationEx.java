package learnEncapsulation.learnEx;

public class EncapsulationEx {
    private  int age;
    private String name;
    public void setAge(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(int age){
        return age;
    }
    public String getAge(String name){
        return name;
    }
}
