package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizw extends evsn implements evui {
    public static final eizw a;
    private static volatile evuo b;

    static {
        eizw eizwVar = new eizw();
        a = eizwVar;
        evsn.registerDefaultInstance(eizw.class, eizwVar);
    }

    private eizw() {
        evsn.emptyProtobufList();
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
            return new eizw();
        }
        if (iOrdinal == 4) {
            return new eizv();
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
        synchronized (eizw.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
