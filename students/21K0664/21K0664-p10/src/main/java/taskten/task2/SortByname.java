package taskten.task2;

import java.util.Comparator;

public class SortByname implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }

}