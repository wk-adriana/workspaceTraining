public class PasswordMaker {
    private static int MAGIC_NUMBER = 17;

    private static String MAGIC_STRING = new RandomStringGenerator(20, "abcdefghijklmnopqrstvw").next();

    private String firstName;

    private String lastName;

    private int age;

    public PasswordMaker(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getPassword() {
        String password = firstName.substring(firstName.length() - (age % 3));
        String randomString = new RandomStringGenerator(MAGIC_NUMBER, new RandomStringGenerator(10, MAGIC_STRING).next()).next();
        password = password.concat(randomString);
        password = password.concat(String.valueOf(age + lastName.length()));
        return password;
    }
}
