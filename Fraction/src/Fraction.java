// Try to OOP with Java EiEi
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return topN + "/" + btmN;
    }
    public String toFloat() {
        double result = (double) topN / btmN;
        return (result + "");
    }
    public void addFraction (Fraction f) {
        if (f.btmN == btmN) {
            topN = topN + f.topN;
            btmN = f.btmN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
    public boolean myEquals(Fraction x) {
        LowestTermFrac();
        x.LowestTermFrac();
        return (x.topN == topN) && (x.btmN == btmN);
    }
    public void LowestTermFrac() {
        int a = topN;
        int b = btmN;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        topN /= a;
        btmN /= a;
    }
}
