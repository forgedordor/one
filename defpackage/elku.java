package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elku extends evsn implements evui {
    public static final elku a;
    private static volatile evuo v;
    public int b;
    public int e;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public elvs q;
    public elpr s;
    public int u;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String r = "";
    public int t = -1;

    static {
        elku elkuVar = new elku();
        a = elkuVar;
        evsn.registerDefaultInstance(elku.class, elkuVar);
    }

    private elku() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elhr.a;
            return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\n᠌\n\u000b᠌\u000b\f᠌\f\r᠌\r\u000eဉ\u000e\u000fဈ\u0001\u0010ဈ\u000f\u0011ဉ\u0010\u0012᠌\u0011\u0013᠌\u0012", new Object[]{"b", "c", "e", elks.a, "f", "g", "h", evsvVar, "i", evsvVar, "j", evsvVar, "k", evsvVar, "l", evsvVar, "m", evsvVar, "n", elkr.a, "o", enwq.a, "p", elob.a, "q", "d", "r", "s", "t", elgl.a, "u", elvf.a});
        }
        if (iOrdinal == 3) {
            return new elku();
        }
        if (iOrdinal == 4) {
            return new elkq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = v;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elku.class) {
            evsgVar = v;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                v = evsgVar;
            }
        }
        return evsgVar;
    }
}
