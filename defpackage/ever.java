package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ever extends evsn implements evui {
    public static final ever a;
    private static volatile evuo b;

    static {
        ever everVar = new ever();
        a = everVar;
        evsn.registerDefaultInstance(ever.class, everVar);
    }

    private ever() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ever();
        }
        if (iOrdinal == 4) {
            return new eveq();
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
        synchronized (ever.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
