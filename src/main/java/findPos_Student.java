import java.util.Scanner;

public class findPos_Student {
    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter Student's name, who you wana find ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        boolean check=true;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(name)){
                check=false;
                System.out.println("Position of the student in the list "+name+" is "+(i+1));
                break;
            }
        }
        if (check){
            System.out.println("Name not found ");
        }

    }
}
