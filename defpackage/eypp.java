package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypp extends evsn implements evui {
    public static final eypp a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eypp eyppVar = new eypp();
        a = eyppVar;
        evsn.registerDefaultInstance(eypp.class, eyppVar);
    }

    private eypp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eypt.class});
        }
        if (iOrdinal == 3) {
            return new eypp();
        }
        if (iOrdinal == 4) {
            return new eypo();
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
        synchronized (eypp.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
