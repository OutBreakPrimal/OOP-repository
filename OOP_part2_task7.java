public class OOP_part2_task7 {
    public class Programmer {
        private int salary = 1000;
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            if (salary > 1000) {
                this.salary = salary;
            }
            else {
                System.out.println("Salary is too low");
            }
        }
    }
}
