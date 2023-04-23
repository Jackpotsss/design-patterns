package org.jackpot.command.manufacturer;

public class Stereo {

    public void on(){
        System.out.println("音响开启");
    }
    public void setCD(){
        System.out.println("播放CD");
    }
    public void setVolume(int volume){
        System.out.println("设置音响音量："+volume);
    }


    public void off(){
        System.out.println("音响关闭");
    }
}
