class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> cS = new HashMap<>();
        HashMap<Character, Integer> cT = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            cS.put(s.charAt(i), cS.getOrDefault(s.charAt(i), 0)+ 1);
            cT.put(t.charAt(i), cT.getOrDefault(t.charAt(i), 0)+ 1);
        }

        return cS.equals(cT);
    }
}
