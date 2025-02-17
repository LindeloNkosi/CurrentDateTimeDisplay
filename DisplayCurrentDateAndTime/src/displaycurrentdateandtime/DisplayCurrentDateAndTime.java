/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaycurrentdateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lindelo Desiree Nkosi ST10148069
 */
public class DisplayCurrentDateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int day,month,year;
       int second,minute,hour;
       GregorianCalendar date = new GregorianCalendar();
       
       day = date.get(Calendar.DAY_OF_MONTH);
       month = date.get(Calendar.MONTH);
       year = date.get(Calendar.YEAR);
       
       second = date.get(Calendar.SECOND);
       minute = date.get(Calendar.MINUTE);
       hour = date.get(Calendar.HOUR);
       
       System.out.print("NOW:" +year + "/" +month+ "/" + day );
       
       System.out.print( hour+":"+minute+":"+second);
    }
    
}
