package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exsd extends evsn implements evui {
    public static final exsd a;
    private static volatile evuo b;

    static {
        exsd exsdVar = new exsd();
        a = exsdVar;
        evsn.registerDefaultInstance(exsd.class, exsdVar);
    }

    private exsd() {
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
            return new exsd();
        }
        if (iOrdinal == 4) {
            return new exsc();
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
        synchronized (exsd.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
