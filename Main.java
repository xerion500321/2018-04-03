import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, category;
        Float attack, blood, res;
        Scanner scn = new Scanner(System.in);
        ArrayList <Person> per = new ArrayList<>();
        boolean x = true;
        while (x) {
            System.out.println("輸入資料請按1");
            System.out.println("顯示資料請按2");
            System.out.println("刪除資料請按3");
            System.out.println("修改資料請按4");
            System.out.println("結束請按5");
            int s = scn.nextInt();
            int steve = 0;
            switch (s) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("輸入角色ID");
                        name = scn.next();
                        System.out.println("輸入屬性");
                        category = scn.next();
                        System.out.println("輸入攻擊力");
                        attack = scn.nextFloat();
                        System.out.println("輸入血量");
                        blood = scn.nextFloat();
                        System.out.println("輸入回復力");
                        res = scn.nextFloat();
                        per.add(new Person(name, category, attack, blood, res));
                        break;
                        }
                        break;
                    case 2:
                        for (int i = 0; i < per.size(); i++) {
                            Person lol = per.get(i);
                            lol.showAll();
                        }
                        break;
                case 3:
                    System.out.println("輸入欲刪除之角色");
                    name = scn.next();
                    for (int i = 0; i < per.size(); i++) {
                        Person lol = per.get(i);
                        if (lol.getName().equals(name)) {
                            lol.showAll();
                            steve = i;
                            i = per.size(); //停止迴圈
                        }
                    }
                    per.remove(steve);
                    System.out.println("資料已刪除");
                case 4:
                    System.out.println("請輸入欲修改之角色ID");
                    name = scn.next();
                    for (int i = 0; i < per.size(); i++) {
                        Person lol = per.get(i);
                        if (lol.getName().equals(name)) {
                            lol.showAll();
                            steve = i;
                            i = per.size(); //停止迴圈
                        }
                    }
                    System.out.println("輸入角色ID");
                    name = scn.next();
                    System.out.println("輸入屬性");
                    category = scn.next();
                    System.out.println("輸入攻擊力");
                    attack = scn.nextFloat();
                    System.out.println("輸入血量");
                    blood = scn.nextFloat();
                    System.out.println("輸入回復力");
                    res = scn.nextFloat();
                    per.set(steve,new Person(name, category, attack, blood, res));
                    break;
                case 5:
                    x = false;
                    System.out.println("謝謝您本次的使用!");
            }
        }
    }
}