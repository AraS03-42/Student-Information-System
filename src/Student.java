public class Student {

    String name,number, stuNo,classes;
    Course c1, c2, c3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    
    void addBulExamnote(int note1, int note2, int note3){

        if(note1>= 0 && note1<=100){this.c1.note=note1;}
        if(note2>= 0 && note2<=100){this.c2.note=note2;}
        if(note3>= 0 && note3<=100){this.c3.note=note3;}

    }

    void isPass(){
        
        double avarage= (this.c1.note+this.c2.note+this.c3.note)/ 3.0;
        
        if(avarage>= 50 && avarage<=100){System.out.println( this.name + " puanı: "+avarage+ " Success");}
        if(avarage>= 0 && avarage<50){System.out.println(this.name + " puanı: "+avarage+ " Failed");}
        
    }

    }

    

