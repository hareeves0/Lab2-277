import java.util.Comparator;

public class SortbyLast_Name implements Comparator<Employee>{
    public int compare(Employee a, Employee b) {
        return a.getLast_name().compareTo(b.getLast_name());
    }
}
