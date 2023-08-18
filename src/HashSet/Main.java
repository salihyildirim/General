package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) { // HASHSET - LinkedHashSet - TreeSet olarak SET'ler 3 adettir
        //Set, AYNI DEĞERİ birden fazla BARINDIRMAZ. Fakat 2 tane olursa hata da vermez.
        //f(x) = x^2 mod7 *sqrt(x) örneğin bu fonk'a ne versen farklı çıkar.
        //Elemanlar sırasız depolanır. Her eleman hashCode() methodu ile bir hash değeri alır.
        //HashMap'deki anahtarların yerine, HashSet'te elemanların değeri kullanılır.

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("salih");
        hashSet.add("anil");
        //hashSet.add(11);
        hashSet.add("Salih");
        hashSet.add(null);
        // hashSet.add(true);
        // hashSet.size();
        hashSet.remove("salih");
        System.out.println(hashSet.hashCode()); //hash objeleri, hash code sahiptir.
        for (Object o : hashSet) {
            System.out.println(o);
        }

        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println("in iterator " + itr.next());
        }

        hashSet.forEach(i -> System.out.println(i + "= foreachli "));
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("salih");
        linkedHashSet.add("zeynep");
        linkedHashSet.add("mehmet");

        Iterator<String> ite= linkedHashSet.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

        //TREESET
        System.out.println("////////// TREESET /////////");
        TreeSet<Student> students= new TreeSet<>(new CompareName().reversed()); // Sıralama belirtmezsen hata verir.
        students.add(new Student("Salih",90));
        students.add(new Student("Ahmet",93));
        students.add(new Student("Zeynep",100));

        for (Student student: students){
            System.out.println(student.getName());
        }

    }

}
