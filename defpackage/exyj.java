package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exyj extends evsn implements evui {
    public static final exyj a;
    private static volatile evuo b;

    static {
        exyj exyjVar = new exyj();
        a = exyjVar;
        evsn.registerDefaultInstance(exyj.class, exyjVar);
    }

    private exyj() {
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
            return new exyj();
        }
        if (iOrdinal == 4) {
            return new exyi();
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
        synchronized (exyj.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
