package exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        System.out.println("Размер массива не 4х4.");
    }
}
