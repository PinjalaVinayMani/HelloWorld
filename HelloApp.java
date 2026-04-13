public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {

            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }
            System.out.println("Hello, " + nameBuilder.toString() + "!");

        } else {
            System.out.println("Hello, World!");
        }
    }
}
