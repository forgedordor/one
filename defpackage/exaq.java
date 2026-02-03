package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exaq extends evsn implements evui {
    public static final exaq a;
    private static volatile evuo b;

    static {
        exaq exaqVar = new exaq();
        a = exaqVar;
        evsn.registerDefaultInstance(exaq.class, exaqVar);
    }

    private exaq() {
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
            return new exaq();
        }
        if (iOrdinal == 4) {
            return new exap();
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
        synchronized (exaq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
