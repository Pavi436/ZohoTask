public class Pattern0 {

    public static void innerPattern(int n)
    {

        int size = 5;
        int row = 0;
        int col = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {//3!=0(T)
            for (int i = row; i <= col; i++) {
                for (int j = row; j <= col;j++) {
                    if (i == row || i == col||
                            j == row || j == col)

                        a[i][j] = n;
                }
            }
            ++row;
            --col;
            --n;
        }
        print(a, size);
    }
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }

            System.out.println(" ");
        }


    }
    public static void main(String[] args)
    {
        int n = 3;
        innerPattern(n);
    }
}