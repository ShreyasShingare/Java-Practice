class Solution {
    public int scoreOfString(String s) {
        char[] sArr = s.toCharArray();
        int score = 0;
        for(int i=0;i<sArr.length-1;i++){
            score = score + Math.abs((int)sArr[i]-(int)sArr[i+1]);
        }      
        return score;
    }
}
