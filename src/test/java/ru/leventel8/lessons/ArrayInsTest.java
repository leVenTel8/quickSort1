package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayInsTest {
    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        ArrayIns arr = new ArrayIns(10);        //создание объекта массива с размеров 10 ячеек
        arr.insert(5);                         // вставка элемента в массив
        assertEquals(5, arr.getFirst());    // сравнение ожидаемого значения, с возвращаемым

    }//end testInsert()

    /**
     * проверка сортировки
     */
    @Test
    public void testQuickSort() {
        ArrayIns arr = new ArrayIns(10);
        arr.insert(5);
        arr.insert(8);
        arr.insert(50);
        arr.insert(77);
        arr.insert(44);
        arr.insert(33);
        arr.insert(1);
        arr.insert(10);
        arr.insert(555);
        arr.quickSort();
        assertEquals(1, arr.getFirst());
    }//end testQuickSort()

    /**
     * проверка частичной
     * сортировки массива
     */
    @Test
    public void testPartitionIt() {
        ArrayIns arr = new ArrayIns(10);            //создание объекта массива с размеров 10 ячеек

        long pivot = 99;                                // задаем опорное значение

        arr.insert(157);                           // вставляем элементы в массив
        arr.insert(650);
        arr.insert(350);
        arr.insert(450);
        arr.insert(90);
        arr.insert(44);
        arr.insert(3);
        arr.insert(100);
        arr.insert(50);
        arr.insert(1000);

        assertEquals(4,arr.partitionIt(0, 9, pivot)); // сравниваем ожидаемое значение с выходным
    }//end testPartitionIt()

}//end class ArrayInsTest