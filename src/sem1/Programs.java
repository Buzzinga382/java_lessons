package sem1;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Programs {
    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Hello, %s!", name);
//        iScanner.close();

        // Дан массив единиц и нулей [1,1,0,1,0,1,1,1]
        // вывести наибольшее количество идущих подряд единиц

//        int[] arr = new int[]{1,1,0,1,1,1,1,1,0,1,1,1};
//        int count = 0;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                count++;
//                if(count > max){
//                    max = count;
//                }
//            }
//            else {
//                count = 0;
//            }
//        }
//        System.out.println(max);

/////////////////////////////////////////////////////////////////////////////

//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны
//        от заданного, а остальные - равны ему.

        int[] nums = new int[]{3,2,2,3,1,2,5,3,1,3,4,6};
        int val = 3;
        int if_count = 0;
        int else_count = 0;
        int[] new_arr = new int[nums.length];

        // Основной код:
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                new_arr[nums.length - 1 - if_count] = nums[i];
                if_count++;
            }
            else {
                new_arr[else_count] = nums[i];
                else_count++;
            }
        }

        // Вывод в консоль:
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]);
        }

        // Второе решение:
//        int[] array = new int[]{2,3,2,3,5,2,3,3,4,7,2};
//        int value = 3;
//        int last = array.length-1;
//        while(array[last]==value && last>=0)
//            last--;
//        for(int i=0;i<=last;i++)
//        {
//            if(array[i]==value)
//            {
//                int tmp = array[i];
//                array[i] = array[last];
//                array[last]=tmp;
//                last--;
//                if(array[last]==value && last >= i)
//                    last--;
//            }
//        }
//        for(int i=0;i<array.length;i++)
//            System.out.printf("%d ", array[i]);
//    }
//}

    }
}
