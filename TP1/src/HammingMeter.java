package src;
public class HammingMeter {
    public int distance(String s1, String s2) {
        int distance = 0;
        if (s1.length() != s2.length())
            throw new IllegalArgumentException("Strings must be of equal length");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                distance++;
        }
        return distance;
    }
}