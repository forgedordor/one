package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxq extends evsn implements evui {
    public static final erxq a;
    private static volatile evuo b;

    static {
        erxq erxqVar = new erxq();
        a = erxqVar;
        evsn.registerDefaultInstance(erxq.class, erxqVar);
    }

    private erxq() {
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
            return new erxq();
        }
        if (iOrdinal == 4) {
            return new erxp();
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
        synchronized (erxq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
