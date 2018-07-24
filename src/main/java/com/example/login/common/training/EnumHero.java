package com.example.login.common.training;

/**
 * @author wangch
 * @Description:
 * @date 2018/7/2416:05
 */
public enum EnumHero {
    TANK("tank","坦克"),
    WIZARD("wizard","法师"),
    ASSASSIN("assassion","刺客"),
    ASSIST("assist","辅助"),
    WARRIOR("warrior","近战"),
    RANGED("ranged","远程"),
    PUSH("push","推进"),
    FARMING("farming","打野");

    private String key;

    private String value;

    private EnumHero(String key,String value){
        this.key = key;
        this.value = value;
    }

    public void shuohua(){
        System.out.println("我是"+this.value+"类英雄");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
