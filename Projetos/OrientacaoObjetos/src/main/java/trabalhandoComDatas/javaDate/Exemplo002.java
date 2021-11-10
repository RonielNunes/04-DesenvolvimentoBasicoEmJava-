package trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        //1626113420104

        Date date = new Date(currentTimeMillis);
        System.out.println(date);
        //Mon Jul 12 15:10:53 BRT 2021


    }
}
