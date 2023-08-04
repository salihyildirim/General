package GenericExamples;

import com.sun.security.auth.NTNumericCredential;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class YourCustomer<T,C> { // diger sınıflarla bir ilgisi olmayan tek basina ornektir.
    public T x;
    public String y ;

    public void myFons() {
        System.out.println(y.getClass().getName());
        System.out.println("Deneme" + x);
        System.out.println(x.getClass().getName());
    }

    public  <T,K> C myFoo(T[] t,K k,C c){

        List<String> myList = new LinkedList<>();
        Stream.of(t).forEach(System.out::println);
        Stream.of(myList).forEach(System.out::println);
        System.out.println(k);
        Arrays.stream(t).forEach(System.out::println);

        List<List<String>> matrix= new LinkedList<>();




        return c;
    }
    public void arraylenght(){

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(arr2.stream().distinct());

    }
}
