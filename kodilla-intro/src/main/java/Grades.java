import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Grades{
    public static void main(String[]args){
        Grades grades = new Grades();
        grades.add(2);
        grades.add(7);
        grades.add(1);

        System.out.println(grades.size);
        System.out.println(grades.LastGrade());
        System.out.println(grades.SumGrades(grades.grades));
    }



    private int [] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 3;
    }

    public void add (int value){
        if (this.size==10) {
            return;
        }

        this.grades[this.size] = value;
        this.size++;

    }

    public int LastGrade(){
        return this.grades[this.size-1];

    }

    public int SumGrades(int[]grades){
        int result=0;
        for(int i=0; i < grades.length; i++){
            result = result +grades[i];
        }
        return result;
    }

}