import java.util.*;

public class App{

    
    public static void main(String[] args) {
        ZodiacProcess p=new ZodiacProcess();
        Scanner sc=new Scanner(System.in);
        String birthday;
        int year;

        System.out.print("Input your birth year MM/DD/YYYY:");
        birthday = sc.next();

        year=p.getYear(birthday);
        p.selection(year);
    }
}
