package arrays;

public class tArray {
    public static void main(String[] args) {
        // first [] is number of rows and second [] is number of columns
        /*
        int[][] grades = new int[5][5];
        for(int i = 0; i < grades.length; i++) {
            System.out.println(Arrays.toString(grades[i]));
        }
        int[][][] bigGrid = new int[4][4][25];
        
        for(int i = 0; i < bigGrid.length; i++) {
            System.out.println(bigGrid[i]);
            for (int j = 0; j < bigGrid.length; j++) {
                System.out.println(bigGrid[i][j]);
                for(int k = 0; k < bigGrid.length; k++) {
                    System.out.println(bigGrid[i][j][k]);
                }
            }
        }
        
        for(int i = 0; i < bigGrid.length; i++) {
            System.out.println(bigGrid[i][i][i]);
        }
        System.out.println(Arrays.toString(bigGrid));
        */
        
        String[] names = {"Harry", "Ron", "Hermione"};
        int[][] grades = {
            {72, 65, 89, 48},
            {27, 57, 98, 34},
            {87, 43, 65, 76},
        };

        // r = index of row and c = index of column
        for (int r = 0; r < grades.length; r++) {
            /*
            switch (r) {
                case 0: System.out.print("\nStudent " + (r + 1) + " Grades: "); break;
                case 1: System.out.print("\nStudent " + (r + 1) + " Grades: "); break;
                case 2: System.out.print("\nStudent " + (r + 1) + " Grades: "); break;
            }
            */
            switch (r) {
                case 0: System.out.print(names[r] + " grades: "); break;
                case 1: System.out.print(names[r] + " grades: "); break;
                case 2: System.out.print(names[r] + " grades: "); break;
            }
            for (int c = 0; c < grades[r].length; c++) {
                System.out.print(grades[r][c] + " ");
            }
            System.out.println("\n");
        }
    }
}
