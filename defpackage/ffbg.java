package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbg {
    private final fffb a;
    private long b = 262144;

    public ffbg(fffb fffbVar) {
        this.a = fffbVar;
    }

    public final String a() {
        String strQ = this.a.q(this.b);
        this.b -= strQ.length();
        return strQ;
    }

    public final feyn b() {
        feyl feylVar = new feyl();
        while (true) {
            String strA = a();
            if (strA.length() == 0) {
                return feylVar.b();
            }
            int iN = fdgn.N(strA, ':', 1, 4);
            if (iN != -1) {
                String strSubstring = strA.substring(0, iN);
                strSubstring.getClass();
                String strSubstring2 = strA.substring(iN + 1);
                strSubstring2.getClass();
                feylVar.c(strSubstring, strSubstring2);
            } else if (strA.charAt(0) == ':') {
                String strSubstring3 = strA.substring(1);
                strSubstring3.getClass();
                feylVar.c("", strSubstring3);
            } else {
                feylVar.c("", strA);
            }
        }
    }
}
