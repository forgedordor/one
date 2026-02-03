package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoir extends evsn implements evui {
    public static final eoir a;
    private static volatile evuo l;
    public int b;
    public int d;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean k;
    public String c = "";
    public String e = "";
    public String j = "";

    static {
        eoir eoirVar = new eoir();
        a = eoirVar;
        evsn.registerDefaultInstance(eoir.class, eoirVar);
    }

    private eoir() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
        }
        if (iOrdinal == 3) {
            return new eoir();
        }
        if (iOrdinal == 4) {
            return new eoiq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoir.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
