package service;

public class MagicSquareService {

    public int[][] generateMagicSquare(int size){
        if (size%2==0) throw new IllegalArgumentException("cant be odd size");

        int[][] square = new int[size][size];

        int row = 0;
        int col = size/2;

        square[row][col] = 1;

        for(int i = 2; i <= size*size; i++){
            row = decrementRowCol(row, size);
            col = incrementRowCol(col, size);

            if(square[row][col] != 0){
                row = incrementRowCol(row, size);
                col = decrementRowCol(col, size);
                row = incrementRowCol(row, size);
            }
            square[row][col] = i;

        }
        return square;
    }

    private int decrementRowCol(int colOrRow, int size){
        if (colOrRow == 0){
            return size - 1;
        } else {
            return colOrRow - 1;
        }
    }

    private int incrementRowCol(int colOrRow, int size){
        if (colOrRow == size - 1){
            return 0;
        } else {
            return colOrRow + 1;
        }
    }
}
