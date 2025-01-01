class Solution {
    public boolean solution(String s) {        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            int asciiCode = s.charAt(i);
            if (asciiCode >= 65 && asciiCode <= 90 || asciiCode >= 97 && asciiCode <= 122) {
                return false;
            }
        }
        
        return true;
    }
}