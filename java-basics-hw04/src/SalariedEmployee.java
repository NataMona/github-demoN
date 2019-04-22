import java.util.Locale;

public class SalariedEmployee extends Employee{
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return this.socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return this.fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

 // @Override
 /*public double getAverageMonthlySalary() {
    return this.fixedMonthlyPayment;
  }*/

  @Override
  public void calculatePay() {
    setAverageMonthlySalary(fixedMonthlyPayment);
  }
  @Override
  public String toString() {
    super.toString();
    String format = "%.2f";
    return "SalariedEmployee{" +
            "socialSecurityNumber='" + socialSecurityNumber + '\'' +
            ", fixedMonthlyPayment=" + getName() + String.format(Locale.US, format, this.getFixedMonthlyPayment());}
}
