package org.jackpot.templatemethod;

public class BusinessModel {

    /**
     * 发布: release()定义了发布算法的步骤,子类不允许修改,只能外部调用
     */
    public final boolean release() {
        if (!canRelease()) {
            return false;
        }
        boolean release = doRelease();
        updateWorkFlowState();
        afterRelease();
        return release;
    }

    /**
     * 钩子函数,用于控制是否可以发布
     */
    protected boolean canRelease() {
        return true;
    }
    //允许子类重新定义发布逻辑,或添加发布逻辑
    protected boolean doRelease() {
        System.out.println("父类发布逻辑。。。");
        return true;
    }
    //修改工作流状态,这步逻辑定义为私有,不允许修改
    private void updateWorkFlowState(){
        System.out.println("更新工作流状态。。。");
    }
    //钩子函数,父类为空实现,子类可以选择实现或不实现,用于添加发布成功的后续业务逻辑
    protected void afterRelease() {
    }
}
