package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennw extends evsn implements evui {
    public static final ennw a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ennw ennwVar = new ennw();
        a = ennwVar;
        evsn.registerDefaultInstance(ennw.class, ennwVar);
    }

    private ennw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", ennu.class});
        }
        if (iOrdinal == 3) {
            return new ennw();
        }
        if (iOrdinal == 4) {
            return new ennv();
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
        synchronized (ennw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
