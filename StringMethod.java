 public class StringMethods {
    public static void main(String[] args) {
        String s = "Java Programming";

        System.out.println("Length: " + s.length());
        System.out.println("Char at 2: " + s.charAt(2));
        System.out.println("Substring(5): " + s.substring(5));
        System.out.println("Substring(5, 11): " + s.substring(5, 11));
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Index of 'gram': " + s.indexOf("gram"));
    }
}

