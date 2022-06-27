import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
class CalendarTask {
	public static void main(String args[]){
	   Calendar calendar = Calendar.getInstance(); 
           
       Date date = new Date();  
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");  
       System.out.println(sdf1.format(date));  
	   
	   SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");  
       System.out.println(sdf2.format(date));  

       SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMM-yyyy");  
       System.out.println(sdf3.format(date));  

       SimpleDateFormat sdf4 = new SimpleDateFormat("E , MMM dd yyyy");    
       System.out.println(sdf4.format(date));  

	   System.out.println("The current date is : " + calendar.getTime()); 
 
	   calendar.add(Calendar.DATE, 2);  
	   System.out.println("2 days later: " + calendar.getTime());  
	   calendar.add(Calendar.MONTH, 1);  
	   System.out.println("1 months later: " + calendar.getTime());  
	   calendar.add(Calendar.YEAR, 4);  
	   System.out.println("4 years later: " + calendar.getTime()); 
         calendar.add(Calendar.DATE, -2);  
	   System.out.println("2 days ago: " + calendar.getTime());  
	   calendar.add(Calendar.MONTH, -1);  
	   System.out.println("1 months ago: " + calendar.getTime());  
	   calendar.add(Calendar.YEAR,-4);  
	   System.out.println("4 years ago: " + calendar.getTime()); 
         
	}
}