public abstract class Employee implements Payable {
  private String name;
  private String id;
  private double avgMonthlySalary;
  public Employee(){}

  public Employee(String employeeId, String name) {
    this.id = employeeId;
    this.name = name;
  }
  public double getAverageMonthlySalary() {
    return avgMonthlySalary;
  }

  public void setAverageMonthlySalary(double avgMonthlySalary) {
    this.avgMonthlySalary = avgMonthlySalary;
  }
  public String getEmployeeId() {
    return this.id;
  }

  public void setEmployeeId(String employeeId) {
    this.id = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //public abstract double getAverageMonthlySalary();


  public abstract void calculatePay();


  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", id='" + id + '\'' +
            '}';
  }

 // protected abstract Object getAverageMonthlySalary();
}
