package ru.leventel8.lessons;

class QuickSortApp {

    public static void main(String[] args){

        int maxSize = 16;                               //размер массива
        ArrayIns arr;
        arr = new ArrayIns(maxSize);                    // новый массив размера maxSize
        for(int j=0; j<maxSize; j++){

            long n = (int)(java.lang.Math.random()*99); // вставка раномных значений в массив
            arr.insert(n);

        }
        arr.display();                                      // вывод содержимого массива
        arr.quickSort();                                    // быстрая сортировка
        arr.display();                                      // вывод содержимого массива

    }//end main()

}//end class QuickSortApp
