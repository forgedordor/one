package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewma extends evsn implements evui {
    public static final ewma a;
    private static volatile evuo j;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    static {
        ewma ewmaVar = new ewma();
        a = ewmaVar;
        evsn.registerDefaultInstance(ewma.class, ewmaVar);
    }

    private ewma() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", ewly.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new ewma();
        }
        if (iOrdinal == 4) {
            return new ewlz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewma.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
