import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[]arr=new int[SIZE];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap cac phan tu mang : ");
        for (int i =0; i<SIZE; i++){
            System.out.println("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int min = arr [0];
        for (int i =1; i<SIZE; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(" gia tri nho nhat trong mang la " + min);
    }
}
