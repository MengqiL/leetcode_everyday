import java.util.*;
class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        HashSet<HashSet<Character>> setOfSets = new HashSet<HashSet<Character>>();
        
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> setOfSub = new HashSet<Character>();
            int j = i;
            while(j < s.length() && !setOfSub.contains(s.charAt(j))) {
                setOfSub.add(s.charAt(j));
                j++;
            }
            setOfSets.add(setOfSub);
        }
        for(HashSet<Character> hs : setOfSets) {
        	System.out.println(hs.toString());
            if(hs.size() > maxSize) {
                maxSize = hs.size();
            }
        }
        return maxSize;
    }
}
