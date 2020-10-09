/**
 * 欧几里得算法 - 求最大公约数
 *
 * @author yanzy
 * @date 2020-06-17 14:03
 */
public class Gcb {
    public static int gcb(int p, int q){
        if(q == 0){
            return p;
        }
        int r = p % q;
        return gcb(q, r);
    }

    public static void main(String[] args) {
        System.out.println(Gcb.gcb(22, 33));
    }
}
