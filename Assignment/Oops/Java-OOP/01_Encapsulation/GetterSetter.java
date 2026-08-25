class Employee {
    private int empId;
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
}

public class GetterSetter {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        System.out.println("Employee ID: " + emp.getEmpId());
    }
}
