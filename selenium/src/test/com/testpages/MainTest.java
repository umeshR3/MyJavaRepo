package com.testpages;

import org.testng.annotations.Test;
import utillPackage.Utillclass;

import java.io.IOException;

public class MainTest {

    Utillclass utillclass;
    @Test
    public void testExcel() throws IOException {
        utillclass=new Utillclass();
        String value= utillclass.excelInstance(1,1);
        System.out.println("Value of excel is"+value);
    }
}
