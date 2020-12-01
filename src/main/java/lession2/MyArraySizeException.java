package lession2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int row, int column) {
        super("Некорректный размер массива");
    }
}