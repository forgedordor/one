package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdu extends evsn implements evui {
    public static final exdu a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        exdu exduVar = new exdu();
        a = exduVar;
        evsn.registerDefaultInstance(exdu.class, exduVar);
    }

    private exdu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", exds.class});
        }
        if (iOrdinal == 3) {
            return new exdu();
        }
        if (iOrdinal == 4) {
            return new exdt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exdu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
