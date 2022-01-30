//1.Напишите метод,на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2.Далее метод должен пройтись по всем элементам массива,преобразовать в int,и просуммировать.
// Если в каком-то элементе массива преобразование не удалось(например,в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException,с детализацией в какой именно ячейке лежат неверные данные.
//3.В методе main()вызвать полученный метод,обработать возможные исключения
// MySizeArrayException и MyArrayDataException,и вывести результат расчета.


import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        checkSizeAndData();
    }

    private static void checkSizeAndData() throws MyArraySizeException, MyArrayDataException {

        String[][] array1 = {
                {"1", "1", "1", "1"},
                {"1", "a", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            if ((array1[i].length != 4) | (array1.length != 4)) {
                throw new MyArraySizeException();
            }
        }

        int summ = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
                try {
                    summ = summ + Integer.parseInt(array1[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Символ " + array1[i][j] + " находится в ячейке i=" + i + ", j=" + j + ". Индекс первого элемента массива принят за 0.");
                    throw new MyArrayDataException();
                }
        }

        System.out.println("Сумма всех элементов массива равна " + summ);

    }
}
