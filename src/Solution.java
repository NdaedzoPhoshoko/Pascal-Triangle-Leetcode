import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> n = new ArrayList<>();
        n.add(4);
        n.add(5);
        //n.add(6);
        //n.add(7);
        System.out.println(findNumber(n));
    }

    public static String findNumber(List<Integer> number){
        while(number.size() > 2){//list shrinks to size 2 then our loop stops
            for(int i=0; i< (number.size()-1); ++i) //finding sums for each level
            {
                String sum = (number.get(i) + number.get(i+1)) + ""; //get current number and then add it with the succeeding number
                int r_m_d = Integer.parseInt(sum.charAt(sum.length()-1)+""); //fetch only only the right most digit
                number.set(i, r_m_d);//add it where we removed the element
                if(i==number.size()-2){
                    number.remove(number.size()-1);//for each level remove last element since it is for a previous level
                }
            }
        }
        return number.get(0)+""+number.get(1);
    }
}
