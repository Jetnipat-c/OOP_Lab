/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07 
*/

public class MyDate
{
    private int day,month,year;

    public MyDate(int _day, int _month, int _year){
        setDay(_day);
        setMonth(_month);
        setYear(_year);
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int _day){
        this.day = _day;
    }

    public void setMonth(int _month){
        this.month = _month;
    }

    public void setYear(int _year){
        this.year = _year;
    }

    public String toString(){
        return day + " " + month + " " + year;
    }
    
}
