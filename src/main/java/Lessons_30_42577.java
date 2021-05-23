import java.util.Arrays;

public class Lessons_30_42577 {
    public static void main(String[] args){

        String[] participant_a = {"119", "97674223", "1195524421"};

        String[] participant_b = {"123","456","789"};

        String[] participant_c = {"12","123","1235","567","88"};

        System.out.println(solution(participant_c));

    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean result = true;
        for (int i=0; i<phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

}
