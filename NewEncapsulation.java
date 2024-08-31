package learnEncapsulation.learnEx;

public class NewEncapsulation {
    public static void main(String[] args) {
        EncapsulationEx e1 = new EncapsulationEx();
        e1.setAge(3, "Apeksha");
        System.out.println(e1.getAge(8));
        System.out.println(e1.getAge("Bhushan"));

    }
}
