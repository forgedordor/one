package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzv extends evsn implements evui {
    public static final elzv a;
    private static volatile evuo f;
    public int b;
    public int c;
    public long d;
    public long e;

    static {
        elzv elzvVar = new elzv();
        a = elzvVar;
        evsn.registerDefaultInstance(elzv.class, elzvVar);
    }

    private elzv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", elzu.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new elzv();
        }
        if (iOrdinal == 4) {
            return new elzt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elzv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
