package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eply extends evsn implements evui {
    public static final eply a;
    private static volatile evuo r;
    public int b;
    public boolean j;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public long p;
    public epma q;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public evqs i = evqs.b;
    public String k = "";

    static {
        eply eplyVar = new eply();
        a = eplyVar;
        evsn.registerDefaultInstance(eply.class, eplyVar);
    }

    private eply() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007Ȉ\b\u0007\t\f\n\u0007\u000b\u0004\f\u0002\rဉ\u0000\u000eȈ\u000f\n", new Object[]{"b", "c", "f", "g", "h", "j", "k", "d", "l", "m", "n", "o", "p", "q", "e", "i"});
        }
        if (iOrdinal == 3) {
            return new eply();
        }
        if (iOrdinal == 4) {
            return new eplx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = r;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eply.class) {
            evsgVar = r;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                r = evsgVar;
            }
        }
        return evsgVar;
    }
}
