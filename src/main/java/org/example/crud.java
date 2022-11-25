package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class crud {
    static Connection c;
    static Statement ss;
    static String query;
    static ResultSet r;
    static sec c1;

    static {
        try {
            c = sec.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertt(int id,String n,String p){
        try {
            c = c1.connect();
            ss=c.createStatement();
            String querry= "INSERT INTO `employeee`.`employeee`VALUES("+id+",'"+n+"'"+",'"+p+"'"+");";
            ss.execute(querry);
            System.out.println("inserted");
        }catch(Exception ee){
            System.out.println(ee.getMessage());
        }
        finally {
            try{
                c.close();
                ss.close();

            } catch (SQLException ee) {
                System.out.println(ee.getMessage());
            }
        }

    }
    public static void updated(int id, String n){
        try {
            c = c1.connect();
            ss=c.createStatement();
            String querry= "UPDATE `employeee`.`employeee`SET `name` ="+"'"+n+"'"+ "WHERE `id` ="+id+";";
            ss.execute(querry);
            System.out.println("updated");
        }catch(Exception ee){
            System.out.println(ee.getMessage());
        }
        finally {
            try{
                c.close();
                ss.close();

            } catch (SQLException ee) {
                System.out.println(ee.getMessage());
            }
        }

    }


    public static void show(){
        try {
            c = c1.connect();
            ss=c.createStatement();
            String querry= "SELECT * FROM employeee.employeee;";
            r=ss.executeQuery(querry);
            while(r.next()){
                System.out.println(r.getInt("id"));
                System.out.println(r.getString("name"));
                System.out.println(r.getString("phone"));
                System.out.println("........\n");
            }
            System.out.println("showed");
        }catch(Exception ee){
            System.out.println(ee.getMessage());
        }
        finally {
            try{
                c.close();
                ss.close();

            } catch (SQLException ee) {
                System.out.println(ee.getMessage());
            }
        }

    }

}

