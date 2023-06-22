import java.io.File;
import java.util.Arrays;

public class metod {
    //ЧТЕНИЕ ФАЙЛА
    public static String FRead(String fname) throws Exception {
        BufferedReader filedata = new BufferedReader(new FileReader(fname));
        String data=filedata.readLine();
        //System.out.println(data);
        return data;
    }
    //ПРЕОБРАЗОВАНИЕ СТРОКИ В МАССИВ
    public static String[] Separator(String data) throws Exception {
        String structData = data.replaceAll("\\{|}| |\"", "").replaceAll(":", ",");
        String[] words = structData.split(",");
        //System.out.println(Arrays.asList(words));
        return words;
    }
    
    //ПОСТРОЕНИЕ ЗАПРОСА
    public static String orderMaker(String[] words) throws Exception {
        StringBuilder sb = new StringBuilder("select * from students where ");
        for (int i=0; i<=words.length/2; i+=2){
            if (words[i+1]!="null"){
                sb.append(words[i]);
                sb.append(" = '");
                sb.append(words[i+1]);
                sb.append("'");
            }

            if (i!=words.length/2){
                sb.append(" and ");
            }
        }
        String order = sb.toString();
        return order;
    }
    
}
