package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] x){
        HashMap<String,String> sozluk = new HashMap<String,String>(); //sıralı değildir.
        sozluk.clear();
        sozluk.put("0","deger1");
        sozluk.put("1","deger2");
        sozluk.put("2","deger3");
        sozluk.put("3","deger4");
        sozluk.put("1","deger999"); // hata vermez üstüne yazar.

        System.out.println(sozluk.size());

        System.out.println(sozluk.remove("0"));
        System.out.println(sozluk);
        System.out.println(sozluk.get("0"));

        for (String item: sozluk.keySet()){
            System.out.println("Key :+5 ="+item+5 +"Değer = "+sozluk.get(item));

        }

        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("selam");
        myArrayList.add("naber");
        myArrayList.add("nasılsın");
        myArrayList.add("iyiyim");

        System.out.println(myArrayList.size());
        myArrayList.remove(0);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(0));


    }
}
