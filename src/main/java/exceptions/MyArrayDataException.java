package exceptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException() {
        System.out.println("В ячейке массива присутствует символ или символы, не поддающиеся конвертации в int.");
        System.out.println("Обработчик исключений возвращает только первый обнаруженный символ, который невозможно конвертировать в int.");
        System.out.println("Вычисление суммы всех элементов массива невозможно.");
    }
}
