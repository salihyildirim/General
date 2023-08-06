package GenericCustomList;

public class Main {
    public static void main(String []args){
        CustomList customList = new CustomList<Integer>();
        customList.add(5);
        customList.add(5);
        customList.add(5);
        customList.add(5);
        customList.add(5);
        customList.add(5);
        customList.add(5);
        customList.add(5);

        customList.add(5);
        customList.add(5);
        customList.add(5);




        System.out.println("CustomList Size = "+customList.size());
        System.out.println("CustomList Capacity = "+customList.getCapacity());
    }
}
