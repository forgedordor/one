package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdq extends evsn implements evui {
    public static final exdq a;
    private static volatile evuo b;

    static {
        exdq exdqVar = new exdq();
        a = exdqVar;
        evsn.registerDefaultInstance(exdq.class, exdqVar);
    }

    private exdq() {
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
            return new exdq();
        }
        if (iOrdinal == 4) {
            return new exdp();
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
        synchronized (exdq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
