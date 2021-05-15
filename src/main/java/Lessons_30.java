import java.util.*;

public class Lessons_30 {
    public static void main(String[] args){

        String[] participant_a = {"leo", "kiki", "eden"};
        String[] completion_a = {"eden", "kiki"};

        String[] participant_b = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion_b = {"josipa", "filipa", "marina", "nikola"};

        String[] participant_c = {"mislav", "stanko", "mislav", "ana"};
        String[] completion_c = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant_b, completion_b));
    }

    // HashMap 을 통한 문제 풀이 방

    public static String solution(String[] participant, String[] completion){
        String answer = "";

        HashMap<String, Integer> a = new HashMap<String, Integer>();

        for(String player : participant){
            a.put(player, a.getOrDefault(player,0) + 1);
        }
        for(String player : completion){
            a.put(player, a.get(player) - 1);
        }

        for(String key : a.keySet()){
            if (a.get(key) != 0){
                answer = key;
            }
        }

        return answer;
    }

    // 정렬을 통한 문제 풀이 답안

    /*public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }*/
}
