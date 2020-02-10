import java.util.Comparator;

public class SortbyID implements Comparator<Employee> {
    public int compare(Employee a, Employee b){
        return a.getID_number().compareTo(b.getID_number());
    }
}
