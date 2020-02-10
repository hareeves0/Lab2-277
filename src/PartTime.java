import java.util.Calendar;

public class PartTime extends Staff implements EmployeeInfo{
    double hours_worked;
    PartTime(double hours_worked){
        super(Hourly_Rate);
        this.hours_worked = hours_worked;
    }

    public double getHours_worked() {
        return hours_worked;
    }
    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    public String toString() {
        return  "Last name:" + last_name + "\n" +
                "First name: " + first_name + "\n" +
                "ID employee number: " + ID_number + "\n" +
                "Sex:" + sex + "\n" +
                "Birth date: " + birth_date.get(Calendar.MONTH) + "/" + birth_date.get(Calendar.DAY_OF_MONTH) +
                "/" + birth_date.get(Calendar.YEAR) + "\n" +
                "Hourly Rate: $" + Hourly_Rate + "\n" +
                "Hours worked per week " + hours_worked;
    }
}
