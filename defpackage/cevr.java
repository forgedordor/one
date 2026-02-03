package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cevr extends evsn implements evui {
    public static final cevr a;
    private static volatile evuo w;
    public int b;
    public String c = "";
    public evqs d;
    public long e;
    public evqs f;
    public evqs g;
    public evqs h;
    public int i;
    public int j;
    public int k;
    public ezoc l;
    public ezoc m;
    public eznz n;
    public eznz o;
    public String p;
    public long q;
    public int r;
    public ezuu s;
    public ezuu t;
    public String u;
    public evqs v;

    static {
        cevr cevrVar = new cevr();
        a = cevrVar;
        evsn.registerDefaultInstance(cevr.class, cevrVar);
    }

    private cevr() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.f = evqsVar;
        this.g = evqsVar;
        this.h = evqsVar;
        this.p = "";
        this.u = "";
        this.v = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0014\u0000\u0001\u0001\u0017\u0014\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0004\n\u0005\n\b\n\t\f\n\f\u000b\f\fဉ\u0000\rဉ\u0001\u000eဉ\u0002\u000fဉ\u0003\u0010Ȉ\u0011\u0002\u0012\u0004\u0013ဉ\u0004\u0014ဉ\u0005\u0015ለ\u0006\u0017ည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
        }
        if (iOrdinal == 3) {
            return new cevr();
        }
        if (iOrdinal == 4) {
            return new cevo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = w;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cevr.class) {
            evsgVar = w;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                w = evsgVar;
            }
        }
        return evsgVar;
    }
}
