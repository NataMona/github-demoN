import java.util.Locale;

public class ContractedEmployee extends Employee{
  private String federalTaxId;
  private double hourlyRate;
  private double hoursWorked;


  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return this.federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return this.hoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.hoursWorked = numberOfHoursWorked;
  }

  //@Override
  //public double getAverageMonthlySalary() {
    //return calculatePay();
  //}

  @Override
  public void calculatePay() {
    double avgMonthlySalaryTMP = this.hourlyRate * this.hoursWorked;
    setAverageMonthlySalary(avgMonthlySalaryTMP);
  }

  @Override
  public String toString() {
      super.toString();
      String format = "%.2f";
    return "Employee{" +
            "name='" + getName() + '\'' +
            ", id='" + getEmployeeId() + '\'' +
            '}' + "ContractedEmployee{" +
            "federalTaxId='" + federalTaxId + '\'' +
            ", hourlyRate=" + hourlyRate +
            ", hoursWorked=" + hoursWorked +
            ", averagePay=" + String.format(Locale.US, format, this.getAverageMonthlySalary()) +
            '}';
  }
}
