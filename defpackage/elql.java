package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elql extends evsn implements evui {
    public static final elql a;
    private static volatile evuo b;

    static {
        elql elqlVar = new elql();
        a = elqlVar;
        evsn.registerDefaultInstance(elql.class, elqlVar);
    }

    private elql() {
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
            return new elql();
        }
        if (iOrdinal == 4) {
            return new elqk();
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
        synchronized (elql.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
