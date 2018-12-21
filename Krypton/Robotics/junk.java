package com.company;

import java.util.Date;

public class Main {

    public static void printArr(String[][] s){
        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < s.length;j++){

                    s[i][j] = " # ";

            }
        }
        s[2][2] = " 0 ";
            ///////////////////////
        for(int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++){

                    System.out.print(s[i][j]);
                }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void printArrRectangle(String[][] s,int r,int pos){
        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < s.length;j++){

                s[i][j] = " # ";
            }
        }
        s[5][5] = " 0 ";
            ///////////////////////
        int  counter = -r+1;
            for(int i = -r+1;i < r;i++){
                counter++;
                s[pos-r][pos-i] = " x ";
                s[pos+r-2][pos-i] = " x ";
                s[pos-counter][pos+r-1] = " s ";
                s[pos-counter][pos-r+1] = " s ";
                }

        for(int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++){

                System.out.print(s[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\n\n");
    }

    public static void printArrRectangles(String[][] s,int r,int posX,int posY){
        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < s.length;j++){

                s[i][j] = " # ";
            }
        }
        s[5][5] = " 0 ";
            ///////////////////////
        int  counter = -r+1;
            for(int i = -r+1;i < r;i++){
                counter++;
                s[posY-r][posX-i] = " x ";
                s[posY+r-2][posX-i] = " x ";
                s[posY-counter][posX+r-1] = " s ";
                s[posY-counter][posX-r+1] = " s ";
                }

        for(int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++){

                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        String[][] arr = new String[10][10];
        printArr(arr);
        printArrRectangle(arr,4,5);
        printArrRectangles(arr,2,4,6);
        }
    }



///////////////////////////////////////////



public class App {

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
            array[y_position - radius + i][x_position - radius] = value;

        for (int j=0; j < (radius*2+1); j++)
            array[y_position + radius][x_position - radius + j] = value;

        for (int i=0; i < (radius*2+1); i++)
            array[y_position + radius - i][x_position + radius] = value;

        for (int j=0; j < (radius*2+1); j++)
            array[y_position - radius][x_position + radius - j] = value;
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i=0; i < (array.length); i++) {
            for (int j = 0; j < (array[i].length); j++)
                array[i][j] = 1;
        }
        printArray( array );
        setValueInRadius(array,2,3,1,0);
        printArray( array );
    }
}
