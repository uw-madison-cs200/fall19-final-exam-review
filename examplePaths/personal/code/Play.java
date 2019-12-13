
public class Play
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Tell me who is playing...");
            return;
        }
        for (int i = 0; i >= 0; i++) {
            System.out.printf("All work and no play makes %s a dull boy\n", args[0]);
        }
    }
}
