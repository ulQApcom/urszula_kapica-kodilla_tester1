import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Grades{
    private int [] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 3;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getSize() {
        return size;
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