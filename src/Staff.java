import java.util.Calendar;

public class Staff extends Employee implements EmployeeInfo {
    protected static double Hourly_Rate;

    Staff(double Hourly_Rate) {
        super();
        this.Hourly_Rate = Hourly_Rate;
    }
    @Override
    public double monthlyEarnings() {
        return Hourly_Rate * STAFF_MONTHLY_HOURS;
    }
    public String toString() {
        return  "Last name: " + last_name + "\n" +
                "First name: " + first_name + "\n" +
                "ID employee number: " + ID_number + "\n" +
                "Sex:" + sex + "\n" +
                "Birth date: " + birth_date.get(Calendar.MONTH) + "/" + birth_date.get(Calendar.DAY_OF_MONTH) +
                "/" + birth_date.get(Calendar.YEAR) + "\n" +
                "Hourly rate" + " $" +  Hourly_Rate;
    }
    public void setHourly_Rate(double hourly_Rate) {
        Hourly_Rate = hourly_Rate;
    }
    public double getHourly_Rate() {
        return Hourly_Rate;
    }
}