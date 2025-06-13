package practice.leet;

public class BudgetSubstring {
    public static void main(String[] args) {
        //given two strings of same length and maxCost
        // return max length of substring which will be within the cost
        // cost means sum of difference between characters at a position
        String str1 = "abcd";
        String str2 = "bcdf";
        int maxCost = 2;
        int length = lengthOfSubStringWithinCost(str1,str2,maxCost);
        System.out.println(length);
    }

    private static int lengthOfSubStringWithinCost(String str1, String str2, int maxCost) {
        int left = 0, ans=-1, window=0;
        for(int right = 0; right<str1.length(); right++){
            window += Math.abs(str1.charAt(right)-str2.charAt(right));
            while(window > maxCost){
                window -= Math.abs(str1.charAt(left)-str2.charAt(left));
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
