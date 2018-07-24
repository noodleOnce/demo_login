package com.example.login.common.training;

/**
 * @author wangch
 * @Description:
 * @date 2018/7/2416:35
 */
public enum HeroType {
    TANK("坦克"),
    WIZARD("法师"),
    ASSASSIN("刺客"),
    ASSIST("辅助"),
    WARRIOR("近战"),
    RANGED("远程"),
    PUSH("推进"),
    FARMING("打野");

    private String name;

    private HeroType(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        HeroType heroType = HeroType.RANGED;
        switch (heroType){
            case TANK: System.out.println(heroType.getName());
                break;
            case WIZARD: System.out.println(heroType.getName());
                break;
            case ASSASSIN: System.out.println(heroType.getName());
                break;
            case ASSIST: System.out.println(heroType.getName());
                break;
            case WARRIOR: System.out.println(heroType.getName());
                break;
            case RANGED: System.out.println(heroType.getName());
                break;
            case PUSH: System.out.println(heroType.getName());
                break;
            case FARMING: System.out.println(heroType.getName());
                break;
        }
    }
}
