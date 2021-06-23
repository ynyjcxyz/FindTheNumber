import java.util.*;
public class Main {
    public static void main(String[] args){
        final int start = 10;
        final int end = 20;
        List<Integer>list = new ArrayList<>();
        for(int i=start;i<=end;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        int removed = list.remove((int)(Math.random()*list.size()));
        int found = findMissingNumber(start , end , list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = start; i<= end ; i++){
            sum1 = i + sum1;
        }
        for(int j = 0; j< list.size() ; j++){
            sum2 = list.get(j) + sum2;
        }
        return (sum1-sum2);
    }
}