package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodu extends evsn implements evui {
    public static final eodu a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eodu eoduVar = new eodu();
        a = eoduVar;
        evsn.registerDefaultInstance(eodu.class, eoduVar);
    }

    private eodu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", eods.class});
        }
        if (iOrdinal == 3) {
            return new eodu();
        }
        if (iOrdinal == 4) {
            return new eodt();
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
        synchronized (eodu.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
