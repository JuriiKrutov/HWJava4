import java.util.LinkedList;

/*
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
 */
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(reverse(list));
    }
    static LinkedList reverse(LinkedList<Integer> list){
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (!list.isEmpty()){
            linkedList.add(list.removeLast());
        }
        list = linkedList;
        return list;
    }
}
