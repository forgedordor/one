package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyla extends evsn implements evui {
    public static final eyla a;
    private static volatile evuo b;

    static {
        eyla eylaVar = new eyla();
        a = eylaVar;
        evsn.registerDefaultInstance(eyla.class, eylaVar);
    }

    private eyla() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eyla();
        }
        if (iOrdinal == 4) {
            return new eykz();
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
        synchronized (eyla.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
