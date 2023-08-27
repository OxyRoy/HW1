import java.util.Arrays;
import java.util.stream.IntStream;

public class HW1 {
    public static void main(String[] args) {

        int min = -50;
        int max = 50;
        int mainM[] = new int[50];
        int pos[] = new int[50];
        int neg[] = new int[50];
        int zero[] = new int[50];
        int sumpos = 0;
        int sumneg = 0;
        double average = 0;


        for (int i = 0; i < mainM.length; i++) {
            mainM[i] = (int) (Math.random() * ((max - min) + 1) + min);
            if (mainM[i] > 0) pos[i] = mainM[i];

            if (mainM[i] < 0) neg[i] = mainM[i];

            if (mainM[i] == 0) zero[i] = mainM[i];

            sumpos += pos[i];

            sumneg += neg[i];

            average += mainM[i];


        }


        System.out.println(Arrays.toString(mainM));
        System.out.println("Положительные " + Arrays.toString(pos));
        System.out.println("Отрицательные " + Arrays.toString(neg));
        System.out.println("Нули " + Arrays.toString(zero));
        System.out.println("Сумма сумма положительных " + sumpos);
        System.out.println("Cумма отрицательных " + sumneg);
        System.out.println("Среднее по массиву " + (average/50));

    }

}
