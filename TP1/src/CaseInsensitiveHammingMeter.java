package src;

public class CaseInsensitiveHammingMeter extends HammingMeter {
    public int distance(String s1, String s2) {
        return super.distance(s1.toLowerCase(), s2.toLowerCase());
    }
}
