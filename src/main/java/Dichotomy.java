import java.util.ArrayList;
import java.util.List;

/**
 * 二分法查找
 *
 * @author yanzy
 * @date 2020-10-09 14:11
 */
public class Dichotomy {
    private int i = 1;

    public boolean query(List<Integer> data, Integer target) {
        if(data == null || data.size() == 0){
            return false;
        }
        int middleIndex = data.size() % 2 == 0 ? data.size() / 2 - 1 : data.size() / 2;
        if (data.get(middleIndex).equals(target)) {
            return true;
        }
        i++;
        data = target > data.get(middleIndex) ? data.subList(middleIndex + 1, data.size()) : data.subList(0, middleIndex + 1);
        return query(data, target);
    }

    public int getI(){
        return i;
    }

    public static void main(String[] args) {
        List<Integer> origin = new ArrayList<>(20);
        origin.add(1);
        origin.add(2);
        origin.add(3);
        origin.add(4);
        origin.add(5);
        Dichotomy dichotomy = new Dichotomy();
        boolean queryResult = dichotomy.query(origin, 5);
        int count = dichotomy.getI();
        System.out.println("查找结果为: " + queryResult + ", 查找次数为: " + count + ". \n");
    }
}
