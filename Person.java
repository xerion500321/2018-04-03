public class Person {
    private String name, category;
    private Float attack, blood, res;

    public Person(String name1, String category1, Float attack1, Float blood1,Float res1) {
        this.setName(name1);
        this.setCategory(category1);
        this.setAttack(attack1);
        this.setBlood(blood1);
        this.setRes(res1);
    }
    public void setName(String name1) { name=name1; }

    public void setCategory(String category1) { category=category1; }

    public void setAttack(float attack1) { attack=attack1; }

    public void setBlood(float blood1) { blood=blood1; }

    public void setRes(float res1) { res=res1; }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public float getAttack() { return attack; }

    public float getBlood() { return blood; }

    public float getRes() { return res; }

    public void showAll() {
        System.out.println("角色:" + this.getName());
        System.out.println("屬性:" + this.getCategory());
        System.out.println("攻擊力:" + this.getAttack());
        System.out.println("血量:" + this.getBlood());
        System.out.println("回復力:" + this.getRes());
    }
}