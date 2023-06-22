import java.io.File;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) throws Exception {
        String fname = "E:\\\\IT\\\\JAVA\\\\2HW\\\\task1\\\\src\\\\dataB.txt";
                
        String data = metod.FRead(fname); //читаем из файла
        String[] words=metod.Separator(data); //из строки получаем массив слов
        String order=metod.orderMaker(words); // формируем запрос
        System.out.println(order);  //выводим
    }
}