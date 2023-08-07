package GenericCustomList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList<Integer>();
        CustomList customList2;

        customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        customList.add(6);



        //customList.remove(5);


        System.out.println("CustomList Size = " + customList.size());
        System.out.println("CustomList Capacity = " + customList.getCapacity());
        System.out.println("Items of List : "+ customList.toString());
        System.out.println("Index : "+ customList.indexOf(1));
        System.out.println("IsEmpty ?: " +customList.isEmpty());
        customList2 = customList.sublist(2,5);
        System.out.println(customList2.toString());
        customList2.clear();
        System.out.println(customList2.size());
        System.out.println(customList2.getCapacity());
        System.out.println(customList2.toString());
        System.out.println(customList2.isEmpty());
        System.out.println(customList.contains(null));


        Object myArray = (Object) customList.toArray();
        System.out.println(myArray.toString());
    }
}
