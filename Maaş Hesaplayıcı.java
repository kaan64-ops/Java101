public class Main {
     static public class Employee {

     String name;
     double salary;
     int workHours;
     int hireYear;

     Employee(String name,double salary,int workHours,int hireYear){
         this.name=name;
         this.salary=salary;
         this.workHours=workHours;
         this.hireYear=hireYear;
     }
     double tax(){
         double tax=0;
        if(this.salary>1000){
            tax=(this.salary*0.03);
        }
        return tax;
     }
     double bonus(){
         int bonus=0;
         if(this.workHours>40){
             bonus=(this.workHours-40)*30;
         }
         return bonus;
     }
     double raiseSalary(){
         int workedYears=2021-this.hireYear;
         double inc=0;

         if(workedYears<10){
             inc=(this.salary*0.05);
         } else if (workedYears>9&&workedYears<20) {
             inc=(this.salary*0.1);
         } else if (workedYears>19) {
             inc=(this.salary*0.15);
         }
         return inc;
     }
     void tostring(){
         System.out.println("Adı : "+this.name);
         System.out.println("Maaşı : "+this.salary);
         System.out.println("Çalışma Saati : "+this.workHours);
         System.out.println("Başlangıç Yılı : "+this.hireYear);
         System.out.println("Vergi : "+tax());
         System.out.println("Bonus : "+bonus());
         System.out.println("Maaş Artışı : "+raiseSalary());
         System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(this.salary+bonus()-tax()));
         System.out.println("Toplam Maaş : "+(this.salary+bonus()-tax()+raiseSalary()));

     }



     }


     public static void main(String[] args) {
        Employee s1 =new Employee("kemal",2000,45,1985);
        s1.tostring();


    }
}
