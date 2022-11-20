package Exercise_01_JunitTest;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Yazmin", "Erazo", 2020);

        String result = person.fullname();
        System.out.println(result);

        boolean result2= person.isLegalAge();
        System.out.println(result2);

        boolean result3= person.isLegalAge2();
        System.out.println(result3);
    }
}
