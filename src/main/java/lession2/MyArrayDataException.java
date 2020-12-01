package lession2;

public class MyArrayDataException extends RuntimeException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Некорректные данные в: ряд " + i + ", строка " + j);
        this.i = i;
        this.j = j;
    }

}