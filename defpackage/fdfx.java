package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fdfx extends fdfw {
    public static final int c(char c) {
        int iB = fdfv.b(c);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException(a.K(c, "Char ", " is not a decimal digit"));
    }

    public static final boolean d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
