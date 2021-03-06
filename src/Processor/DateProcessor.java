/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class DateProcessor {

    public DateProcessor() {
    }

    public String UpDate(int date, int month, int year, int added) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, date);
        cal.add(Calendar.DATE, added);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return sdf.format(cal.getTime());
    }

    public String getCurrentDate() {
        String date = java.time.LocalDate.now().getDayOfMonth() + "/" + java.time.LocalDate.now().getMonthValue() + "/" + java.time.LocalDate.now().getYear();

        return date;
    }

    public String ReverseDate(String date) {
        return date.split("/")[2] + "-" + date.split("/")[1] + "-" + date.split("/")[0];
    }

    public String ConvertDate(String date) {
        return date.split("-")[2] + "/" + date.split("-")[1] + "/" + date.split("-")[0];
    }

    public int CompareDate(String date1, String date2) {
        int day1, day2, month1, month2, year1, year2;
        day1 = Integer.parseInt(date1.split("/")[0]);
        day2 = Integer.parseInt(date2.split("/")[0]);
        month1 = Integer.parseInt(date1.split("/")[1]);
        month2 = Integer.parseInt(date2.split("/")[1]);
        year1 = Integer.parseInt(date1.split("/")[2]);
        year2 = Integer.parseInt(date2.split("/")[2]);

        Calendar cal1 = Calendar.getInstance();
        cal1.set(year1, month1 - 1, day1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(year2, month2 - 1, day2);
        return cal1.compareTo(cal2);
    }

    public int CompareDate(String date1, String date2, int distance)//date 1 + distance < date 2 => 
    {
        DateProcessor x = new DateProcessor();
        int day1, day2, month1, month2, year1, year2;

        day1 = Integer.parseInt(date1.split("/")[0]);
        month1 = Integer.parseInt(date1.split("/")[1]);
        year1 = Integer.parseInt(date1.split("/")[2]);
        date1 = x.UpDate(day1, month1, year1, distance);

        day1 = Integer.parseInt(date1.split("/")[0]);
        month1 = Integer.parseInt(date1.split("/")[1]);
        year1 = Integer.parseInt(date1.split("/")[2]);

        day2 = Integer.parseInt(date2.split("/")[0]);
        month2 = Integer.parseInt(date2.split("/")[1]);
        year2 = Integer.parseInt(date2.split("/")[2]);

        Calendar cal1 = Calendar.getInstance();
        cal1.set(year1, month1 - 1, day1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(year2, month2 - 1, day2);
        return cal1.compareTo(cal2);
    }

// H??m ki???m tra n??m nhu???n
    public Boolean isSpecialYear(int nYear) {
        if ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0) {
            return true;
        }
        return false;

        // <=> return ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0);
    }

// H??m tr??? v??? s??? ng??y trong th??ng thu???c n??m cho tr?????c
    int daysOfMonth(int nMonth, int nYear) {
        int nNumOfDays = 0;
        switch (nMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nNumOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nNumOfDays = 30;
                break;
            case 2:
                if (isSpecialYear(nYear)) {
                    nNumOfDays = 29;
                } else {
                    nNumOfDays = 28;
                }
                break;
        }

        return nNumOfDays;
    }

// H??m ki???m tra ng??y dd/mm/yyyy cho tr?????c c?? ph???i l?? ng??y h???p l???
    public Boolean isDate(String date) {
        int nDay =0, nMonth= 0, nYear = 0;
        nDay = Integer.parseInt(date.split("/")[0]);
        nMonth = Integer.parseInt(date.split("/")[1]);
        nYear = Integer.parseInt(date.split("/")[2]);
        
        if (nYear < 0) {
            return false; // Ng??y kh??ng c??n h???p l??? n???a!
        }

        // Ki???m tra th??ng
        if (nMonth < 1 || nMonth > 12) {
            return false; // Ng??y kh??ng c??n h???p l??? n???a!
        }

        // Ki???m tra ng??y
        if (nDay < 1 || nDay > daysOfMonth(nMonth, nYear)) {
            return false; // Ng??y kh??ng c??n h???p l??? n???a!
        }

        return true; // Tr??? v??? tr???ng th??i cu???i c??ng...
    }

}
