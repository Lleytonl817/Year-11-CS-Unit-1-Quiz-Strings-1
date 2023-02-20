public class Strings {

    public static void main(String[] args) {

        // 1.
        int age = 33;

        // 2.
        String name = new String("T Swizzle");

        // 3.
        System.out.println(age);
        // 4.
        System.out.println(name);
        // 5.
        String description = new String("My name is " + name + " and I am " + age + " years old");
        // 6.
        System.out.println(description);
        // 7.
        System.out.println(description.length());
        // 8.
        String nameSubDescription = new String(description.substring(11, 21));

        // 9.
        int ageSubDescription = Integer.parseInt(description.substring(30,32));
        // 10.

        String subDescription = new String("My name is " + nameSubDescription + " and I am " + ageSubDescription + " years old");
        System.out.println(subDescription);

    }

}
