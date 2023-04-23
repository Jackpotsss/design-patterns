package org.jackpot.abstractfactory.product;

public interface Screen {

    /** 尺寸：英寸*/
    double size();

    /** 刷新率：Hz*/
    int refreshRate();

    String model();
}
