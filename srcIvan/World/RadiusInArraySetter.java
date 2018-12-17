public class RadiusInArraySetter {
    public static void printArray( int[][] array ) {
        int i, j;
        for (i=0; i < (array.length); i++) {
            for (j=0; j < (array[i].length); j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void setValueInRadius(int[][] array, int x_position, int y_position, int radius, int value) {

        for (int i=0; i < (radius*2+1); i++)
            try {
                array[y_position - radius + i][x_position - radius] = value;
            } catch (ArrayIndexOutOfBoundsException e) {continue;}

        for (int j=0; j < (radius*2+1); j++)
            try {
                array[y_position + radius][x_position - radius + j] = value;
            } catch (ArrayIndexOutOfBoundsException e) {continue;}


        for (int i=0; i < (radius*2+1); i++)
            try {
                array[y_position + radius - i][x_position + radius] = value;
            } catch (ArrayIndexOutOfBoundsException e) {continue;}

        for (int j=0; j < (radius*2+1); j++)
            try {
                array[y_position - radius][x_position + radius - j] = value;
            } catch (ArrayIndexOutOfBoundsException e) {continue;}
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i=0; i < (array.length); i++) {
            for (int j = 0; j < (array[i].length); j++)
                array[i][j] = 1;
        }
        printArray( array );
        setValueInRadius(array,0,0,1,0);
        printArray( array );
    }
}
