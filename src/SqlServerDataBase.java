public class SqlServerDataBase extends BaseDataBaseManager{
    private String x;
    SqlServerDataBase(String x){this.x=x;
        System.out.printf(" \n "+ x);}
    @Override
    public void getData() {
        System.out.println("Veri getirildi SqlDataBase");
    }

    public String getX(){
        return this.x;
    }

    public static void myTest() {
        System.out.println("TEST CALISTI");
    }
}
