package org.jackpot.strategy;

//薪资计算执行器
public class SalaryExecutor {

    private SalaryCalculator salaryCalculator;

    public SalaryExecutor(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }
    public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }
    public void execute() {
        salaryCalculator.calculate();
    }
}
