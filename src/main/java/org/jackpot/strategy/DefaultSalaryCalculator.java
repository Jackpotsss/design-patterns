package org.jackpot.strategy;

//实现一个默认的薪资计算器
public class DefaultSalaryCalculator implements SalaryCalculator{

    @Override
    public void calculate() {
        System.out.println("默认的薪资计算器逻辑");
    }
}
