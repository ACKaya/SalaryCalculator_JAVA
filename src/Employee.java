public class Employee {
    String name;
    int salary;
    double workHours;
    int hireYear;
    Employee(String name,int salary,double workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if(this.salary<1000){
            return 0;
        }
        else{
            double tax=this.salary*0.03;
            return tax;
        }
    }
    double bonus(){
        if(this.workHours<40){
            return 0;
        }
        else{
            double bonus=(this.workHours-40)*30;
            return bonus;
        }
    }
    double riseSalary(){
        if(this.hireYear<0||this.hireYear>2021){
            System.out.println("Hatalı Bir Giriş Yaptınız!");
            return 0;
        }
        else{
            int farkYil=2021-hireYear;
            double maasArtis;
            if(farkYil<10){
                maasArtis=salary*0.05;
                return maasArtis;

            } else if (farkYil>9&&farkYil<20) {
                maasArtis=salary*0.1;
                return maasArtis;


            } else if (farkYil>19) {
                maasArtis=salary*0.15;
                return maasArtis;
                
            }
            return 0;
        }
    }
    public String toString(){
        double toplamMaas=this.salary-tax()+bonus()+riseSalary();
        System.out.println("Adi:"+this.name);
        System.out.println("Maasi:"+this.salary);
        System.out.println("Calisma Saati:"+this.workHours);
        System.out.println("Baslangic Yili:"+this.hireYear);
        System.out.println("Vergi"+tax());
        System.out.println("Bonus:"+bonus());
        System.out.println("Maas Artisi:"+riseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maas:"+(toplamMaas-riseSalary()));
        System.out.println("Toplam Maasi:"+toplamMaas);



        return null;
    }


}
