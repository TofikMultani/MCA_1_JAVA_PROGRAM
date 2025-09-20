import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDate 
{
    public static void main(String[] args) 
	{
        	LocalDate today = LocalDate.now(); 
        	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        	System.out.println(today.format(format));
    	}
}
