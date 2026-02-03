package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elki extends evsn implements evui {
    private static volatile evuo G;
    public static final elki a;
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean F;
    public int b;
    public Object d;
    public int e;
    public int f;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public int s;
    public int t;
    public long u;
    public int v;
    public int w;
    public int x;
    public eltf y;
    public boolean z;
    public int c = 0;
    public int g = -1;
    public int h = -1;
    public evsx E = emptyIntList();

    static {
        elki elkiVar = new elki();
        a = elkiVar;
        evsn.registerDefaultInstance(elki.class, elkiVar);
    }

    private elki() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emtw.a;
            return newMessageInfo(a, "\u0001\u001f\u0001\u0001\u0001$\u001f\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0006ဇ\u0005\t᠌\b\n᠌\t\u000b᠌\n\fင\u000b\r᠌\f\u000eင\r\u000f᠌\u000e\u0010င\u000f\u0011ဂ\u0010\u0012င\u0011\u0013င\u0012\u0014ဃ\u0013\u0015᠌\u0014\u0017င\u0016\u0018᠌\u0017\u0019ဉ\u0018\u001aဇ\u0019\u001b᠌\u001a\u001c\u083f\u0000\u001d\u083f\u0000\u001e\u083f\u0000\u001f᠌\u001b ᠌\u001c!᠌\u001d\"ࠞ$ဇ\u001e", new Object[]{"d", "c", "b", "e", elkc.a, "f", eljz.a, "g", "h", "i", "j", elkd.a, "k", elkb.a, "l", eljt.a, "m", "n", eljv.a, "o", "p", elno.a, "q", "r", "s", "t", "u", "v", elox.a, "w", "x", eljy.a, "y", "z", "A", elko.a, eljw.a, elkg.a, elkf.a, VCardConstants.PARAM_ENCODING_B, eljs.a, "C", evsvVar, "D", evsvVar, "E", elnr.a, "F"});
        }
        if (iOrdinal == 3) {
            return new elki();
        }
        if (iOrdinal == 4) {
            return new elkh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = G;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elki.class) {
            evsgVar = G;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                G = evsgVar;
            }
        }
        return evsgVar;
    }
}
