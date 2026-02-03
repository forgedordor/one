package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsc extends evsn implements evui {
    public static final evsc a;
    private static volatile evuo c;
    public float b;

    static {
        evsc evscVar = new evsc();
        a = evscVar;
        evsn.registerDefaultInstance(evsc.class, evscVar);
    }

    private evsc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new evsc();
        }
        if (iOrdinal == 4) {
            return new evsb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evsc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
