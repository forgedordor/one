package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exhx extends evsn implements evui {
    public static final exhx a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        exhx exhxVar = new exhx();
        a = exhxVar;
        evsn.registerDefaultInstance(exhx.class, exhxVar);
    }

    private exhx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new exhx();
        }
        if (iOrdinal == 4) {
            return new exhv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exhx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
