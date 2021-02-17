public class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int gap = 0;
        int temp = 0;

        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                temp++;
            } else {
                if (temp > gap) {
                    gap = temp;
                }
                temp = 0;
            }
        }
        return gap;
    }
}
