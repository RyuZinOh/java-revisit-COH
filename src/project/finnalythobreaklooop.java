package project;

public class finnalythobreaklooop {
    public static void main(String[] args) {
        int a = 0;
        boolean loopBroken = false;
        while (a <= 10) {
            try {
                if (a == 5) {
                    loopBroken = true;
                    break;
                } else {
                    System.out.println("hakunamatata");
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("cleaning up");
            }
            a++;
        }

        if (loopBroken) {
            // Execute some quest
            System.out.println("Loop was broken, executing some quest...");
        }
    }
}
