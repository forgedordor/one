package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdo extends evsn implements evui {
    public static final exdo a;
    private static volatile evuo b;

    static {
        exdo exdoVar = new exdo();
        a = exdoVar;
        evsn.registerDefaultInstance(exdo.class, exdoVar);
    }

    private exdo() {
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
            return new exdo();
        }
        if (iOrdinal == 4) {
            return new exdn();
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
        synchronized (exdo.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
