package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqv extends evsn implements evui {
    public static final cgqv a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public long d;
    public boolean e;

    static {
        cgqv cgqvVar = new cgqv();
        a = cgqvVar;
        evsn.registerDefaultInstance(cgqv.class, cgqvVar);
    }

    private cgqv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cgqv();
        }
        if (iOrdinal == 4) {
            return new cgqu();
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
        synchronized (cgqv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
