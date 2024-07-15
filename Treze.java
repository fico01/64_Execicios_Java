import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Treze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] nums = new Integer[3];


        for(int i = 0; i < 3; i++){
            System.out.println("Digite o valor["+(i+1)+"]");
            nums[i] = scan.nextInt();
        }

        Arrays.sort(nums, Collections.reverseOrder());

        for (int num = 0; num < nums.length; num++) {

            System.out.print(nums[num] + " ");

        }



    }
}
