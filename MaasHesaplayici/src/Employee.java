public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double taxPrice = 0;
        if (this.salary > 1000) {
            taxPrice = this.salary * 0.03;
        } else {
            System.out.println("Vergi alinmamistir.");
        }
        return taxPrice;
    }

    double bonus() {
        double bonusIncome = 0;
        if (this.workHours > 40) {
            bonusIncome = (this.workHours - 40) * 30;
        } else {
            System.out.println("Bonus ucret verilmemistir.");
        }
        return bonusIncome;
    }

    double raiseSalary() {
        int workYear = (2022 - this.hireYear);
        double raise = 0;
        if (workYear < 10) {
            raise = this.salary * 0.05;
        }
        if (workYear > 9 && workYear < 20) {
            raise = this.salary * 0.1;
        }
        if (workYear > 19) {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    void toStringg() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile Birlikte Maaşı : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaşı : " + (this.salary + bonus() - tax() + raiseSalary()));
    }


}