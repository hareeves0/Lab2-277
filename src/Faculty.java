import java.util.Calendar;

enum Level{
    AS, AO, FU
}
public class Faculty extends Employee implements EmployeeInfo, Cloneable{
    protected Level level;
    protected String Degree;
    protected String Major;
    protected int Research;
    protected Education education;
    protected double  monthlyEarnings;

    Faculty(Level level, String Degree, String Major, int Research){
        super();
        this.education = new Education(Degree, Major, Research);
        this.level = level;
        this.monthlyEarnings = monthlyEarnings();

    }
    public String getDegree(){
        return Degree;
    }
    public String getMajor(){
        return Major;
    }
    public int getResearch(){
        return Research;
    }
    public Education getEducation(){
        return education;
    }
    public double getmonthlyEarnings(){
        return monthlyEarnings();
    }
    public void setDegree(String Degree) {
        this.Degree = Degree;
    }
    public void setMajor(String Major) {
        this.Major = Major;
    }
    public void setResearch(int Research) {
        this.Research = Research;
    }
    public void setEducation(Education education){
        this.education = education;
    }

    public double monthlyEarnings() {
        switch (level) {
            case AS:
                monthlyEarnings = FACULTY_MONTHLY_SALARY;
                break;
            case AO:
                monthlyEarnings = FACULTY_MONTHLY_SALARY * 1.5;
                break;
            case FU:
                monthlyEarnings = FACULTY_MONTHLY_SALARY * 2.0;
                break;
        }
        return monthlyEarnings;
    }
    public String toString(){
        String level_name = null;
        switch (level) {
            case AS:
                level_name = "assistant professor";
                break;
            case AO:
                level_name = "associate professor";
                break;
            case FU:
                level_name = "professor";
                break;
        }
        return  "Last name: " + last_name + "\n" +
                "First name: " + first_name + "\n" +
                "ID employee number: " + ID_number + "\n" +
                "Sex:" + sex + "\n" +
                "Birth date: " + birth_date.get(Calendar.MONTH) + "/" + birth_date.get(Calendar.DAY_OF_MONTH) +
                "/" + birth_date.get(Calendar.YEAR) + "\n" +
                "Level: " + level_name + "\n" +
                "Degree: " + education.getDegree() + "\n" +
                "Major: " + education.getMajor() + "\n" +
                "Research: " + education.getResearch() ;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
