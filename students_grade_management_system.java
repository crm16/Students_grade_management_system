import java.util.*;
public class students_grade_management_system {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numbers = sc.nextInt();
        System.out.print("\n");

        String name[] = new String[numbers];
        int marks [] = new int[numbers];
        char grade[] = new char[numbers];
        for(int i = 0; i < numbers; i++){
            System.out.print("Enter name of student " + (i+1) + ": ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Enter marks of " + name[i] + ": ");
            marks[i] = sc.nextInt();
            if(marks[i] >= 90){
                grade[i] = 'A';
            }
            else if(marks[i] >= 80){
                grade[i] = 'B';
            }
            else if(marks[i] >= 70){
                grade[i] = 'C';
            }
            else if(marks[i] >= 60){
                grade[i] = 'D';
            }
            else if(marks[i] >= 50){
                grade[i] = 'E';
            }
            else{
                grade[i] ='F';
            }
        }

        System.out.print("\n");
        System.out.print("Enter name of student: ");
        sc.nextLine();
        String search = sc.nextLine();
        boolean found = false;

        for(int i = 0; i < numbers; i++){
            if(name[i].equals(search)) {
                System.out.println(name[i] + " scored " + marks[i] + " and received grade " + grade[i] + ".");
                found = true;
            }
        }

        if(!found){
            System.out.println("Record not found........");
        }
        
        sc.close();
    }
}
