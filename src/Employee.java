import java.util.Calendar;

public abstract class Employee {
    protected String last_name;
    protected String first_name;
    protected String ID_number;
    protected String sex;
    protected Calendar birth_date;
    public Employee(String last_name, String first_name, String ID_number, String sex, Calendar birth_date)
    {
        this.last_name = last_name;
        this.first_name = first_name;
        this.ID_number = ID_number;
        this.sex = sex;
        this.birth_date = birth_date;
    }
    public Employee(){}
    public String toString() {
        return "Last name: " + last_name + "\n" +
                "First name: " + first_name + "\n" +
                "ID employee number: " + ID_number + "\n" +
                "Sex:" + sex + "\n" +
                "Birth date: " + birth_date.get(Calendar.MONTH)  + "/" + birth_date.get(Calendar.DAY_OF_MONTH) +
                "/" + birth_date.get(Calendar.YEAR);
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setBirth_date(Calendar birth_date) {
        this.birth_date = birth_date;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getID_number() {
        return ID_number;
    }
    public String getSex() {
        return sex;
    }
    public Calendar getBirth_date() {
        return birth_date;
    }
    public abstract double monthlyEarnings();
}

