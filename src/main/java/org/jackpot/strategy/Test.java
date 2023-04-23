package org.jackpot.strategy;

public class Test {

    public static void main(String[] args){

        SalaryExecutor salaryExecutor = new SalaryExecutor(new DefaultSalaryCalculator());
        salaryExecutor.execute();
        //动态替换算法
        salaryExecutor.setSalaryCalculator(new ZGCSalaryCalculator());
        salaryExecutor.execute();
    }
}
