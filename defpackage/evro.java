package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evro extends evsn implements evui {
    public static final evro a;
    private static volatile evuo b;

    static {
        evro evroVar = new evro();
        a = evroVar;
        evsn.registerDefaultInstance(evro.class, evroVar);
    }

    private evro() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new evro();
        }
        if (iOrdinal == 4) {
            return new evrn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evro.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
