public class MyMetodTask2 {
    private Integer[] arr = new Integer[10];
    private int size = 0;

    void enqueue(int ellement) {          //помещает элемент в конец очереди
        arr[size++] = ellement;
    }

    int dequeue() {                           //возвращает первый элемент из очереди и удаляет его
        if (size == 0) {
            System.out.println("Список пуст");
        }else {
            int firstNum = arr[0];
            Integer[] arr2 = new Integer[arr.length-1];
            System.arraycopy(arr, 1, arr2, 0, arr2.length);
            arr = arr2;
            return firstNum;
        }
        return 0;
    }

    int first() {                             //возвращает первый элемент из очереди
        return arr[0];
    }
}
