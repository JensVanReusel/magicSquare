package controller;

import io.Writer;
import service.MagicSquareService;

public class MagicSquareController {
    private final Writer writer;
    private final MagicSquareService service;


    public MagicSquareController(Writer writer, MagicSquareService service) {
        this.writer = writer;
        this.service = service;
    }

    public void createMagicSquare(int size){

        int[][] magicSquare = service.generateMagicSquare(size);

        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                this.writer.write(String.format("%-2d ", magicSquare[row][col]));
            }
            this.writer.write("\n");
        }

    }
}
