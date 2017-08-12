import java.util.*;

public class Student implements Serializable {
    public static final String[] SUBJECTS = new String[] { 
        "Math","Science","Social Science","English","Hindi","Sanskrit"
    };
    public static final long serialVersionUID = 1L;
    String name;
    int roll;
    int[] marks = new int[6];

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        this.name = scan.next();
        System.out.print("Enter Roll : ");
        this.roll = scan.nextInt();
        for(int i = 0; i < 6; i++) {
            System.out.print("Enter Marks Obtained in " + SUBJECTS[i] + " : ");
            marks[i] = scan.nextInt();
        }
        scan.close();
    }

    public void show() {
        int total = 0;
        double percent = 0.0;
        System.out.println("Name : " + name + "\nroll : " + roll);
        for(int i = 0; i < 6; i++){
            System.out.println(SUBJECTS[i] + " : " + marks[i]);
            total+=marks[i];
        }
        System.out.println("\nTotal Obtained Marks : " + total);
        percent = ((total * 100.0) / 600.0);
        System.out.printf("\nPercentage : %.2f%%",percent);
    }
}