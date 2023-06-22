import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;


public class task2 {
    public static void main(String[] args) throws Exception {
        int[] array=RandomIntArr(); //создаем массив случайных целых чисел
        System.out.println(Arrays.toString(array));

        //Создание логгера
        Logger logwriter = Logger.getLogger(task2.class.getName());
        logwriter.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logwriter.addHandler(ch);
        SimpleFormatter sformat = new SimpleFormatter();
        ch.setFormatter(sformat);
        logwriter.setUseParentHandlers(false);

        //Сортировка
        int temp;
        boolean swap;
        for (int i = 0; i < array.length - 1; i++) {
           swap = false;
           for (int j = 0; j < array.length - i - 1; j++) {
               if (array[j] > array[j + 1]) {
                   temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
                   logwriter.info(" Array: " + Arrays.toString(array) );
                   swap = true;
               }
               
           } 
           if (swap == false) {break;}
       }

    }   

    //МАССИВ СЛУЧАЙНЫХ ЦЕЛЫХ ЧИСЕЛ
    public static int[] RandomIntArr() throws Exception{
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int size = iScanner.nextInt();
        System.out.println("Введите максимальное значение элемента массива");
        int maxValue = iScanner.nextInt();
        int[] initialArr = new int[size];
        int i;
        Random ran = new Random();
        for (i=0;i<size;i+=1){
            initialArr[i]=ran.nextInt(maxValue+1);
        }
        return initialArr;
    }


}

