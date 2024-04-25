import java.util.Scanner;public class rotateelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int[] rotate = {1, 2, 3, 4, 5, 6, 7};
        for (int element : rotate) {
            System.out.print(element);
        }
        System.out.println("\nhow many element you want to rotate:");
        int d = sc.nextInt();
        for (int i = 1; i <= d; i++) {
            int first = rotate[0];
            for (j = 0; j < rotate.length - 1; j++)
                rotate[j] = rotate[j + 1];
            rotate[rotate.length - 1] = first;
        }
          for(int k=0;k<rotate.length;k++){
              System.out.print(rotate[k]+" ");
          }

    }
            }




