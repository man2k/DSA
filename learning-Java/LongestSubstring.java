import java.util.HashSet;
public class LongestSubstring {
    
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i = 0;
        int j = 0;
        int cmax = 0;
        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
            }else{
                cmax = Math.max(cmax,hs.size());
                i++;
                hs.clear();
                j = i;
            }
        }
        return Math.max(hs.size(),cmax);
    }
}

// Another soln but slower

// import java.util.HashSet;
// import java.util.Set;
// class Solution {
//     public static boolean checkDup(String s){
//         HashSet<Character> hs = new HashSet<>();
//         int len = s.length();
//         for(int i = 0; i<len;i++){  
//             if(hs.contains(s.charAt(i))){
//                 return true;
//             }else{
//                 hs.add(s.charAt(i));
//             }
//         }
//         return false;
//     }
//     public int lengthOfLongestSubstring(String s) {
//         int i = 0;
//         int j = 0;
//         int cmax = 0;
//         while(j<s.length()){
//             String temp = s.substring(i,j+1);
//             System.out.println("temp : "+temp);
//             if(!checkDup(temp)){
//                 j++;
//                 cmax++;
//             }else{
//                 cmax = Math.max(cmax, temp.length())-1;
//                 i++;
//                 j=i+cmax;
//             }
//         }
//         return cmax;
//     }
// }