import ExceptionOrnek.Exceptions.BakiyeYetersizException;
import ExceptionOrnek.HesapCheck.Hesap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* CustomerManager customerManager = new CustomerManager(new OracleDataBase());
        customerManager.getCustomers();
        SqlServerDataBase.myTest();
        DataBaseHelper.Crud.Update();

        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Salih\\Desktop\\IdeaProjects\\denemeMulakat\\src\\test.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("total : " + total);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        Hesap hesap = new Hesap();
        System.out.println(hesap.getBakiye());
        hesap.bakiyeEkle(500);
        System.out.println(hesap.getBakiye());
        try {
            hesap.bakiyeCikar(450);
        } catch (BakiyeYetersizException bakiyeYetersizException) {
            bakiyeYetersizException.getMessage();
        }
        System.out.println(hesap.getBakiye());

        try {
            hesap.bakiyeCikar(100);
        } catch (BakiyeYetersizException bakiyeYetersizException) {
            System.out.println(bakiyeYetersizException.getMessage());
        }
        System.out.println(hesap.getBakiye());

        ArrayList<SqlServerDataBase> sqlServerDataBases= new ArrayList<>();
        for(int i=0 ; i<5;i++) {
            sqlServerDataBases.add(new SqlServerDataBase("Sql Server DataBase :" + i));
        }
        for(SqlServerDataBase s: sqlServerDataBases){
            System.out.println(s.getX());
        }
    }

}