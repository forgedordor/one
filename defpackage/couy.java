package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couy extends evsn implements evui {
    public static final couy a;
    private static volatile evuo m;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public evqs f = evqs.b;
    public String g = "";
    public String h = "";
    public aubx i;
    public aubx j;
    public long k;
    public aubq l;

    static {
        couy couyVar = new couy();
        a = couyVar;
        evsn.registerDefaultInstance(couy.class, couyVar);
    }

    private couy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ည\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဉ\u0006\tဉ\u0007\nဂ\b\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new couy();
        }
        if (iOrdinal == 4) {
            return new coux();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (couy.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
