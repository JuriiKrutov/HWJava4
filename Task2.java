/*
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди,
не удаляя.
 */
public class Task2 {
    public static void main(String[] args) {
        MyMetodTask2 list = new MyMetodTask2();
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);

        System.out.println(list.dequeue());
        System.out.println(list.first());

    }
}

