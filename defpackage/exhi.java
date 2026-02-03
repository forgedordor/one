package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exhi extends evsn implements evui {
    public static final exhi a;
    private static volatile evuo b;

    static {
        exhi exhiVar = new exhi();
        a = exhiVar;
        evsn.registerDefaultInstance(exhi.class, exhiVar);
    }

    private exhi() {
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
            return new exhi();
        }
        if (iOrdinal == 4) {
            return new exhh();
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
        synchronized (exhi.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
