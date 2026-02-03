package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exrr extends evsn implements evui {
    public static final exrr a;
    private static volatile evuo b;

    static {
        exrr exrrVar = new exrr();
        a = exrrVar;
        evsn.registerDefaultInstance(exrr.class, exrrVar);
    }

    private exrr() {
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
            return new exrr();
        }
        if (iOrdinal == 4) {
            return new exrq();
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
        synchronized (exrr.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
