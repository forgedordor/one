package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnw extends evsn implements evui {
    public static final evnw a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        evnw evnwVar = new evnw();
        a = evnwVar;
        evsn.registerDefaultInstance(evnw.class, evnwVar);
    }

    private evnw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", evom.class, evnt.class, evoe.class});
        }
        if (iOrdinal == 3) {
            return new evnw();
        }
        if (iOrdinal == 4) {
            return new evnv();
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
        synchronized (evnw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
