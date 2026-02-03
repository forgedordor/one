package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eocc extends evsn implements evui {
    public static final eocc a;
    private static volatile evuo b;

    static {
        eocc eoccVar = new eocc();
        a = eoccVar;
        evsn.registerDefaultInstance(eocc.class, eoccVar);
    }

    private eocc() {
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
            return new eocc();
        }
        if (iOrdinal == 4) {
            return new eocb();
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
        synchronized (eocc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
