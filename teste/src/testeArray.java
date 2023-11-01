import java.util.Scanner;
public class testeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array [][];
        array = new int[10][10];
            for (int i = 0; i<array.length;i++)
            {
                for (int j = 0; j <array[i].length; j++)
                {
                    System.out.printf("Digite o valor da linha %d e coluna %d: ", i+1,j+1);
                        array [i] [j] = input.nextInt();
                }
            }
            input.close();
    }
}
