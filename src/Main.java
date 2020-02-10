import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Main implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException{
        double total_hours_worked_pt;
        double total_salary_employees;
        ArrayList<Employee> total_employees = new ArrayList<>();

        //staff1
        Staff staff1 = new Staff(50.00);
        Calendar staff1_birthday = new GregorianCalendar();
        staff1.setLast_name("Allen");
        staff1.setFirst_name("Paita");
        staff1.setID_number("123");
        staff1.setSex("M");
        staff1_birthday.set(Calendar.MONTH, 2);
        staff1_birthday.set(Calendar.DAY_OF_MONTH, 23);
        staff1_birthday.set(Calendar.YEAR, 59);
        staff1.setBirth_date(staff1_birthday);
        System.out.println(staff1.toString());
        total_employees.add(staff1);
        System.out.println();

        //staff2
        Staff staff2 = new Staff(35.00);
        Calendar staff2_birthday = new GregorianCalendar();
        staff2.setLast_name("Zapata");
        staff2.setFirst_name("Steven");
        staff2.setID_number("456");
        staff2.setSex("F");
        staff2_birthday.set(Calendar.MONTH, 7);
        staff2_birthday.set(Calendar.DAY_OF_MONTH, 12);
        staff2_birthday.set(Calendar.YEAR, 64);
        staff2.setBirth_date(staff2_birthday);
        System.out.println(staff2.toString());
        total_employees.add(staff2);
        System.out.println();

        //staff3
        Staff staff3 = new Staff(40.00);
        Calendar staff3_birthday = new GregorianCalendar();
        staff3.setLast_name("Rios");
        staff3.setFirst_name("Enrique");
        staff3.setID_number("789");
        staff3.setSex("M");
        staff3_birthday.set(Calendar.MONTH, 6);
        staff3_birthday.set(Calendar.DAY_OF_MONTH, 2);
        staff3_birthday.set(Calendar.YEAR, 70);
        staff3.setBirth_date(staff3_birthday);
        System.out.println(staff3.toString());
        total_employees.add(staff3);
        System.out.println();

        //faculty1
        Faculty faculty1 = new Faculty(Level.FU, "Ph.D", "Engineering", 3);
        Calendar faculty1_birthday = new GregorianCalendar();
        faculty1.setLast_name("Johnson");
        faculty1.setFirst_name("Anne");
        faculty1.setID_number("243");
        faculty1.setSex("F");
        faculty1_birthday.set(Calendar.MONTH, 4);
        faculty1_birthday.set(Calendar.DAY_OF_MONTH, 27);
        faculty1_birthday.set(Calendar.YEAR, 62);
        faculty1.setBirth_date(faculty1_birthday);
        System.out.println(faculty1.toString());
        System.out.println();
        total_employees.add(faculty1);

        //faculty2
        Faculty faculty2 = new Faculty(Level.AO, "Ph.D", "English", 1);
        Calendar faculty2_birthday = new GregorianCalendar();
        faculty2.setLast_name("Bouris");
        faculty2.setFirst_name("William");
        faculty2.setID_number("791");
        faculty2.setSex("F");
        faculty2_birthday.set(Calendar.MONTH, 3);
        faculty2_birthday.set(Calendar.DAY_OF_MONTH, 14);
        faculty2_birthday.set(Calendar.YEAR, 75);
        faculty2.setBirth_date(faculty2_birthday);
        System.out.println(faculty2.toString());
        total_employees.add(faculty2);
        System.out.println();

        //faculty3
        Faculty faculty3 = new Faculty(Level.AS, "MS", "Physical Education", 0);
        Calendar faculty3_birthday = new GregorianCalendar();
        faculty3.setLast_name("Andrade");
        faculty3.setFirst_name("Christopher");
        faculty3.setID_number("623");
        faculty3.setSex("F");
        faculty3_birthday.set(Calendar.MONTH, 5);
        faculty3_birthday.set(Calendar.DAY_OF_MONTH, 2);
        faculty3_birthday.set(Calendar.YEAR, 80);
        faculty3.setBirth_date(faculty3_birthday);
        System.out.println(faculty3.toString());
        total_employees.add(faculty3);
        System.out.println();

        //parttime1
        PartTime parttime1 = new PartTime(30);
        Calendar parttime1_birthday = new GregorianCalendar();
        parttime1.setLast_name("Guzman");
        parttime1.setFirst_name("Augusto");
        parttime1.setID_number("455");
        parttime1.setSex("F");
        parttime1_birthday.set(Calendar.MONTH, 8);
        parttime1_birthday.set(Calendar.DAY_OF_MONTH, 10);
        parttime1_birthday.set(Calendar.YEAR, 77);
        parttime1.setHourly_Rate(35.00);
        parttime1.setBirth_date(parttime1_birthday);
        System.out.println(parttime1.toString());
        total_employees.add(parttime1);
        System.out.println();

        //parttime2
        PartTime parttime2 = new PartTime(15);
        Calendar parttime2_birthday = new GregorianCalendar();
        parttime2.setLast_name("Depirro");
        parttime2.setFirst_name("Martin");
        parttime2.setID_number("678");
        parttime2.setSex("F");
        parttime2_birthday.set(Calendar.MONTH, 9);
        parttime2_birthday.set(Calendar.DAY_OF_MONTH, 15);
        parttime2_birthday.set(Calendar.YEAR, 87);
        parttime2.setHourly_Rate(30.00);
        parttime2.setBirth_date(parttime2_birthday);
        System.out.println(parttime2.toString());
        total_employees.add(parttime2);
        System.out.println();

        //parttime3
        PartTime parttime3 = new PartTime(35);
        Calendar parttime3_birthday = new GregorianCalendar();
        parttime3.setLast_name("Aldaco");
        parttime3.setFirst_name("Marque");
        parttime3.setID_number("945");
        parttime3.setSex("M");
        parttime3_birthday.set(Calendar.MONTH, 11);
        parttime3_birthday.set(Calendar.DAY_OF_MONTH, 24);
        parttime3_birthday.set(Calendar.YEAR, 88);
        parttime3.setHourly_Rate(20.00);
        parttime3.setBirth_date(parttime3_birthday);
        System.out.println(parttime3.toString());
        total_employees.add(parttime3);
        System.out.println();
        System.out.println();

        //total hours worked calculations
        System.out.println("total hours worked calculations");
        total_hours_worked_pt = parttime1.getHours_worked() + parttime2.getHours_worked() + parttime3.getHours_worked();
        System.out.println("Total hours worked by part time staff: " + total_hours_worked_pt);
        System.out.println();
        System.out.println();

        //total salary of all employees calculations
        System.out.println("total salary of all employees calculations");
        total_salary_employees = parttime1.getHours_worked() * parttime1.getHourly_Rate() + parttime2.getHours_worked() * parttime2.getHourly_Rate() + parttime3.getHours_worked() * parttime1.getHourly_Rate() +
                                       staff1.getHourly_Rate() * 40 + staff2.getHourly_Rate() * 40 + staff3.getHourly_Rate() * 40 +
                                       faculty1.getmonthlyEarnings() + faculty2.getmonthlyEarnings() + faculty3.getmonthlyEarnings();
        System.out.println("Total salary of all employees: " + total_salary_employees);
        System.out.println();

        //employees in ascending order by ID
        System.out.println("employees in ascending order by ID");
        System.out.println();
        Collections.sort(total_employees, new SortbyID());
        for(int i = 0; i < total_employees.size(); i ++ ){
            System.out.println(total_employees.get(i));
            System.out.println();
        }
        System.out.println();

        //employees in descending order by last name
        System.out.println("employees in descending order by last name");
        System.out.println();
        Collections.sort(total_employees, new SortbyLast_Name());
        for(int i = 0; i < total_employees.size(); i ++ ){
            System.out.println(total_employees.get(i));
            System.out.println();
        }

        //cloning faculty
        System.out.println("Will print true if clone works");
        Faculty cloned = (Faculty) faculty1.clone();
        System.out.println(faculty1.getClass() == cloned.getClass());
    }
}
