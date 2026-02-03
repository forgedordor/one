package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmi {
    private final fcsu a;

    public cjmi(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final aubq a(cjgr cjgrVar, cjju cjjuVar) {
        int i = cjjuVar.b;
        int iA = cjjt.a(i);
        if (iA == 0) {
            throw null;
        }
        int i2 = iA - 1;
        if (i2 == 0) {
            return ((asqx) this.a.b()).a((cjjuVar.b == 1 ? (cjjp) cjjuVar.c : cjjp.a).c, false);
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("No valid destination set");
        }
        String strSubstring = (i == 2 ? (cjme) cjjuVar.c : cjme.a).c;
        int i3 = cjgrVar.c;
        int iA2 = cjgq.a(i3);
        if (iA2 != 0 && iA2 == 3) {
            return ((asqx) this.a.b()).a(strSubstring, true);
        }
        int iA3 = cjgq.a(i3);
        if (iA3 == 0 || iA3 != 4) {
            throw new IllegalArgumentException("Conversation type not supported");
        }
        if (strSubstring.startsWith("sip:")) {
            strSubstring = strSubstring.substring(4);
        }
        int iIndexOf = strSubstring.indexOf(59);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return ((asqx) this.a.b()).b(strSubstring);
    }
}
