/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован
по убыванию числа телефонов.
 */

import java.util.*;

public class HelloBook{

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phonelist = new HashMap<>();
        addPhone("D", 1212, phonelist);
        addPhone("D", 1313, phonelist);
        addPhone("D", 1414, phonelist);
        addPhone("A", 666, phonelist);
        addPhone("C", 3333,phonelist);
        addPhone("B", 777, phonelist);
        addPhone("C", 222, phonelist);
        addPhone("B", 888, phonelist);
        addPhone("C", 111, phonelist);
        System.out.println("исходный справочник: "+phonelist);//вывод посмотреть
        printPL(phonelist);
    }
    // метод добавления нового телефонного номера
    public static void addPhone(String name, int phone, HashMap<String, ArrayList<Integer>> baze){
        if (baze.containsKey(name)) {
            baze.get(name).add(phone);
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phone);
            baze.put(name, list);
        }
    }
    // Метод вывода отсортированного по именам справочника
    public static void printPL(HashMap<String, ArrayList<Integer>>pl) {
        ArrayList<Integer> numsort=new ArrayList<Integer>();
        ArrayList<String> keysort=new ArrayList<String>();
        for (String key : pl.keySet()) {
            numsort.add(pl.get(key).size());
            keysort.add(key);
        }
        /*//Проверка работоспособность сортировки
        keysort.add("DF");
        numsort.add(-2);
        */
        Integer[] ints = new Integer[numsort.size()];
        numsort.toArray(ints);

        ArrayList<String> sortedList = new ArrayList(keysort);
        Collections.sort(sortedList, (left, right) -> ints[keysort.indexOf(left)] - ints[keysort.indexOf(right)]);

        Collections.reverse(sortedList);
        for (Object o : sortedList) {
            System.out.println(o+": "+pl.get(o));
        }

    }

}