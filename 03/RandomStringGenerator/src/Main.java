public class Main {

    public static void main(String[] args) {
        // Test clasa RandomStringGenerator
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator(5, "abcdefghijklmnop");
        System.out.println("RandomStringGenerator: " + randomStringGenerator.next());

        // Test clasa PasswordMaker
        PasswordMaker passwordMaker = new PasswordMaker("Anastasia", "Popescu", 22);
        System.out.println("PasswordMaker: " + passwordMaker.getPassword());

    }
}
