package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzm extends evsn implements evui {
    public static final enzm a;
    private static volatile evuo l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public enzh g;
    public long h;
    public enzl i;
    public enzl j;
    public enzl k;

    static {
        enzm enzmVar = new enzm();
        a = enzmVar;
        evsn.registerDefaultInstance(enzm.class, enzmVar);
    }

    private enzm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emok.a;
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0003\u0004ဉ\u0004\u0005ဂ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\t\t᠌\u0002", new Object[]{"b", "c", "d", "f", evsvVar, "g", "h", "i", "j", "k", "e", evsvVar});
        }
        if (iOrdinal == 3) {
            return new enzm();
        }
        if (iOrdinal == 4) {
            return new enzj();
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
        synchronized (enzm.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
