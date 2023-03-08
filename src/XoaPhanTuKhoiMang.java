import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        int[] newArr = new int[array.length -1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao vi tri muon xoa");
        int N;
        N = scanner.nextInt();
        for (int i = 0,k=0; i < array.length; i++) {
            if (i==N){
                continue;
            }
            newArr[k++] = array[i];
        }
        System.out.println("mang cu"+ Arrays.toString(array));
        System.out.println("mang moi"+ Arrays.toString(newArr));
    }
}
