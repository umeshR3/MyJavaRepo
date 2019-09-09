package com.testpages;

import com.google.gson.Gson;
import utillPackage.Utillclass;
import utillPackage.com.pojoClasses.Customer;
import utillPackage.com.pojoClasses.authenticationPojoClass;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonExampleDemo {
    static Utillclass utillclass=new Utillclass();
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson=new Gson();
       // System.out.println(utillclass.getFileHandler("test1").getAbsolutePath());
     //authenticationPojoClass auth=gson.fromJson(new FileReader(utillclass.getFileHandler("test1").getAbsolutePath()),authenticationPojoClass.class);
        authenticationPojoClass auth=gson.fromJson(new FileReader("D:\\01Automation\\MyJavaRepo\\selenium\\src\\test\\resources\\jsonFile"),authenticationPojoClass.class);
       // auth.getCustomer()[0].getName();
        Customer[] customer=auth.getCustomer();
      //  System.out.println( customer[0].getName());
        System.out.println(customer[1].getDescription());
        System.out.println( auth.getProjectdetails().getName());
        System.out.println( auth.getProjectdetails().getDescription());
        System.out.println(auth.getUsername());
        System.out.println(auth.getPassword());
    }
}
