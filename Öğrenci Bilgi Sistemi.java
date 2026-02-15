public class Main {
static public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matMain,int matSide, int fizikMain,int fizikSide, int kimyaMain,int kimyaSide) {

        if (matMain >= 0 && matMain <= 100) {
            this.mat.noteMain = matMain;
        }
        if (matSide >= 0 && matSide <= 100) {
            this.mat.noteSide = matSide;
        }

        if (fizikMain >= 0 && fizikMain <= 100) {
            this.fizik.noteMain = fizikMain;
        }
        if (fizikSide >= 0 && fizikSide <= 100) {
            this.fizik.noteSide = fizikSide;
        }

        if (kimyaMain >= 0 && kimyaMain <= 100) {
            this.kimya.noteMain = kimyaMain;
        }
        if (kimyaSide >= 0 && kimyaSide <= 100) {
            this.kimya.noteSide = kimyaSide;
        }

    }

    public void isPass() {
        if (this.mat.noteMain == 0 ||this.mat.noteSide == 0 || this.fizik.noteMain == 0 ||this.fizik.noteSide == 0 || this.kimya.noteMain == 0 || this.kimya.noteSide == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.noteMain*0.80+this.fizik.noteSide*0.20) + (this.kimya.noteMain*0.80+this.kimya.noteSide*0.20) + (this.mat.noteMain*0.80+this.mat.noteSide*0.20)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.noteMain);
        System.out.println("Matematik Sözlü Notu : " + this.mat.noteSide);
        System.out.println("Fizik Sınav Notu : " + this.fizik.noteMain);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.noteSide);
        System.out.println("Kimya Sınav Notu : " + this.kimya.noteMain);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.noteSide);
    }

}
static public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int noteMain;
    int noteSide;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.noteMain = 0;
        this.noteSide = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
static public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,80,20,58,40,56);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,60,50,90,40,80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,70,20,70,40,80);
        s3.isPass();

    }
}
