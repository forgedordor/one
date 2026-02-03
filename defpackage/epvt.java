package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvt extends evsn implements evui {
    public static final epvt a;
    private static volatile evuo b;

    static {
        epvt epvtVar = new epvt();
        a = epvtVar;
        evsn.registerDefaultInstance(epvt.class, epvtVar);
    }

    private epvt() {
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
            return new epvt();
        }
        if (iOrdinal == 4) {
            return new epvs();
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
        synchronized (epvt.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
