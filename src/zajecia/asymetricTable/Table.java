package zajecia.asymetricTable;

public class Table {
    public static void main(String[] args) {


        int[][] masterTable = new int[4][];
        int[] line1 = {1, 2, 3};
        int[] line2 = {4,5};
        int[] line3 = {6,7,8,9};
        int[] line4 = {3};

        masterTable [0] = line1;
        masterTable [1] = line2;
        masterTable [2] = line3;
        masterTable [3] = line4;


        System.out.println(masterTable[0][0] + masterTable[1][0] + masterTable[2][0] + masterTable[3][0]);


    }
}