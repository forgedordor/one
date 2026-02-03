package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exrp extends evsn implements evui {
    public static final exrp a;
    private static volatile evuo b;

    static {
        exrp exrpVar = new exrp();
        a = exrpVar;
        evsn.registerDefaultInstance(exrp.class, exrpVar);
    }

    private exrp() {
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
            return new exrp();
        }
        if (iOrdinal == 4) {
            return new exro();
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
        synchronized (exrp.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
