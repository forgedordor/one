package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erke extends evsn implements evui {
    public static final erke a;
    private static volatile evuo b;

    static {
        erke erkeVar = new erke();
        a = erkeVar;
        evsn.registerDefaultInstance(erke.class, erkeVar);
    }

    private erke() {
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
            return new erke();
        }
        if (iOrdinal == 4) {
            return new erkd();
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
        synchronized (erke.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
