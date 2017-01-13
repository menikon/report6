package jp.ac.uryukyu.ie.e165723;

/**
 * Created by e165723 on 2016/11/26.
 */
public class Enemy  extends LivingThing{
    Enemy(String name,int hitPoint,int attack){
        super(name, hitPoint,attack);
    }
    @Override

    public void attack(LivingThing e) {
        if (!isDead()) {
            int damage = (int) (Math.random() * getAttack());
            if (damage == 0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), e.getName());
            } else {
                int judge = (int) (Math.random() * 10);
                if (judge <= 1) {
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), e.getName(), damage * 2);
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), e.getName(), damage);
                    e.wounded(damage);
                }
            }
        }
    }
}