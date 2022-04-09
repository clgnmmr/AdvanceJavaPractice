package Projects.P04_okulYönetimi;

public class Student {
    Course mat; // --> Course class'tan mat obj
    Course tur; // --> Course class'tan tur obj
    Course bio; // --> Course class'tan bio obj
    double Avarage;
    String name;
    String stuNo;
    String classes;

    public Student(String name, String stuNo, String classes,Course mat,Course tur,Course bio) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat=mat;
        this.tur=tur;
        this.bio=bio;

    }
    public void addBulkExamNote(Course c,int noteYazili,int noteSozlu ){

        c.noteYazili=noteYazili;
        c.noteSozlu=noteSozlu;
        printNote(c.noteYazili,c.noteSozlu);
       calcAvarage(c,c.noteYazili,c.noteSozlu);

    }

    private void printNote(int noteYazili, int noteSozlu) {
        System.out.println("Yazili notunuz : "+noteYazili+"\nSozlu notunuz : "+noteSozlu);

    }

    public void calcAvarage(Course c,int noteYazili, int noteSozlu) {

        this.Avarage=(noteYazili*0.75)+(noteSozlu*0.25);
        isPass(c,Avarage) ;

    }

   public void isPass(Course c,double avarage) {
        if (avarage>=50){
            System.out.println(c.name+" dersini gectiniz...");
        }else System.out.println(c.name+" dersini gecemediniz...");
    }


}
