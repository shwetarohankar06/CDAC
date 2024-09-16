public class BooleanWrapper{
    public static void main(String[] args) {
        boolean status = true;
        Boolean wrappedStatus = Boolean.valueOf(status);  // Autoboxing also works
        System.out.println("Wrapped boolean value: " + wrappedStatus);
    }
}
