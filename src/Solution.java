public class Solution {
    public int solution(int N) {
        if (N < 0) {
            return -1;
        }

        String binary = Integer.toBinaryString(N);
        int gap = 0;
        int temp = 0;

        for (int i = 1; i < binary.length(); i++) {
            if(binary.charAt(i) == '0') {
                temp++;
            } else {
                if (binary.charAt(i) == '1') {
                    if (temp > gap) {
                        gap = temp;
                    }
                    temp = 0;
                }
            }
        }

        return gap;
    }
}
