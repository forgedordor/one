package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswe extends evsn implements evui {
    public static final eswe a;
    private static volatile evuo e;
    public int b;
    public eswi c;
    public eswq d;

    static {
        eswe esweVar = new eswe();
        a = esweVar;
        evsn.registerDefaultInstance(eswe.class, esweVar);
    }

    private eswe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eswe();
        }
        if (iOrdinal == 4) {
            return new eswd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eswe.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
