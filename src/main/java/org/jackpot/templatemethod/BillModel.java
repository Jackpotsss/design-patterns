package org.jackpot.templatemethod;

public class BillModel extends BusinessModel{

    @Override
    protected boolean canRelease() {
//        if(!canRelease){
//            return false;
//        }
        return super.canRelease();
    }

    @Override
    protected void afterRelease() {
        System.out.println("子类发布后的逻辑");
        super.afterRelease();
    }
}
