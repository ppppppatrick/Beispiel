public class Polynom{

    private double a;
    private double b;
    private double c;
    private double d;

    public Polynom(double d) {
        this(0, 0, 0, d);
    }

    public Polynom(double c, double d) {
        this(0, 0, c, d);
    }

    public Polynom(double b, int c, double d) {
        this(0, b, c, d);
    }

    public Polynom(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void add(Polynom p) {
        this.a += p.a;
        this.b += p.b;
        this.c += p.c;
        this.d += p.d;
    }

    public void subtract(Polynom p) {
        this.a -= p.a;
        this.b -= p.b;
        this.c -= p.c;
        this.d -= p.d;
    }

    public int map(double x) {
        double ret = 0;

        if (a != 0) {
            ret += a * Math.pow(x, 3);
        }
        if (b != 0) {
            ret += b * Math.pow(x, 2);
        }
        if (c != 0) {
            ret += c * x;
        }
        ret += d;

        return ret;
    }

    public static Polynom derivation(Polynom p) {
        return new Polynom(p.a * 3, p.b * 2, p.c);
    }

    public String toString() {
        String ret = "";

        if (a != 0) {
            if (a != 1 && a != -1) {
	            ret += a + "*";
            }
            if (a != -1) {
	            ret += "x^3";
            } else {
	            ret += "-x^3";
            }
        }

        if (b != 0) {
            if (ret.length() > 0) {
	            if (b > 0) {
	                ret += " + ";
	            } else {
	                ret += " - ";
	            }
            }
            if (b != 1 && b != -1) {
	            // Die Methode Math.abs(b) gibt den absoluten Wert von b zurueck. Alternativ
	            // kann man dies mit einer Bedingung loesen:
	            // if (b > 0) ret += b + "*"; else ret += -b + "*";
	            ret += Math.abs(b) + "*";
            }
            ret += "x^2";
        }

        if (c != 0) {
            if (ret.length() > 0) {
	            if (c > 0) {
	                ret += " + ";
	            } else {
	                ret += " - ";
	            }
            }
            if (c != 1 && c != -1) {
	            ret += Math.abs(c) + "*";
            }
            ret += "x";
        }

        if (d != 0) {
            if (ret.length() > 0) {
	            if (d > 0) {
	                ret += " + " + d;
	            } else {
	                ret += " - " + -d;
	            }
            } else {
	            ret += d;
            }
        }

        if (ret.length() == 0) {
            ret = "0";
        }

        return ret;
    }
}
