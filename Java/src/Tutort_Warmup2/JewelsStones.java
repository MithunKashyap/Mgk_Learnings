package Tutort_Warmup2;

public class JewelsStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);

    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jcs = jewels.toCharArray();
        char[] scs = stones.toCharArray();
        int count = 0;

        for(char sc : scs){
            for(char jc : jcs){
                if(sc == jc){
                    count++;
                }
            }
        }
        return count;
    }
}
