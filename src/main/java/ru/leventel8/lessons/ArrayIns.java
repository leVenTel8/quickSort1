package ru.leventel8.lessons;

class ArrayIns {

    private long[] theArray;            //Переменная приватного типа, объявление массива
    private int nElems;                 //Переменная приватного типа, объявление счетчика элементов массива

    /**
     * Конструктор при инициализации
     * принимает параметр max
     * @param max
     *      размер массива
     */
    public ArrayIns(int max){

        theArray = new long[max];
        nElems = 0;

    }


    /**
     * вставка в массив
     * @param value
     */
    public void insert(long value){

        theArray[nElems] = value;       // вставка value в ячейку nElems
        nElems++;                       // имнкримент nElems

    }// end insert()

    public void display(){

        System.out.print("A=");
        for(int j=0; j<nElems; j++)             // перебор элементов массива в цикле
            System.out.print(theArray[j]+ " "); // вывод содержимого массива
        System.out.println("");

    }// end display()


    /**
     * быстрая сортировка
     * с высозов рекурсивного метода
     */
    public void quickSort(){

        recQuickSort(0, nElems-1);

    }//end quickSort()

    /**
     * быстрая сортировка
     * за основу берется правое значение pivot
     * @param left, right
     */
    public void recQuickSort(int left, int right){

        if(right-left <= 0)                                         // реализация алгоритма
            return;
        else{

            long pivot = theArray[right];

            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);                    // рекурсивный вызов левой стороны
            recQuickSort(partition+1, right);                    // рекурсивный вызов правой стороны
        }

    }//end recQuickSort

    /**
     * выбор медианы
     * @param left, right, pivot
     * @return leftPtr
     *  левого значения
     */
    public int partitionIt(int left, int right, long pivot){

        int leftPtr = left-1;
        int rightPtr = right;
        while(true){

            while(theArray[++leftPtr]<pivot);
            while(rightPtr>0 && theArray[--rightPtr]>pivot);
            if(leftPtr>=rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;


    }//end partitionIt()

    /**
     * swap двух аргументов
     * @param dex1, dex2
     */
    public void swap(int dex1, int dex2){

        long temp;
        temp = theArray[dex1];
        theArray[dex1]=theArray[dex2];
        theArray[dex2]=temp;

    }//end swap()

    /**
     * метод берет первое значение массива
     */
    public long getFirst(){
        long first = theArray[0];
        return first;

    }//end getFirst()

}//end class ArrayIns
