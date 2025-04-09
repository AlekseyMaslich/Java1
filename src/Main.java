public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            System.out.println("Provided arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}