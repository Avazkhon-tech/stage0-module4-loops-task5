package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        int right = height -1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j >= i && j <= right) || (j <= i && j >= right)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            right--;
            System.out.println();
        }
    }
}
