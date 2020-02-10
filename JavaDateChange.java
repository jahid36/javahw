package com.Hello.text;

import java.util.*;
import java.text.*;

public class JavaDateChange {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("yyyy-mm-dd");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
