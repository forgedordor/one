package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exyr extends evsn implements evui {
    public static final exyr a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        exyr exyrVar = new exyr();
        a = exyrVar;
        evsn.registerDefaultInstance(exyr.class, exyrVar);
    }

    private exyr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new exyr();
        }
        if (iOrdinal == 4) {
            return new exyq();
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
        synchronized (exyr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
