package brute_force;

import java.util.ArrayList;
import java.util.List;

public class mock_exam {
	public int[] solution(int[] answers) {
        int[] str1 = {1,2,3,4,5};
        int[] str2 = {2,1,2,3,2,4,2,5};
        int[] str3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            if(str1[i%5] == answers[i])
                count[0]++;
            if(str2[i%8] == answers[i])
                count[1]++;
            if(str3[i%10] == answers[i])
                count[2]++;
        }
        int max = Math.max(Math.max(count[0], count[1]), count[2]);
        
       if(max == count[0])
           list.add(1);
       if(max == count[1])
           list.add(2);
       if(max == count[2])
           list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}
