package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyve extends evsn implements evui {
    public static final eyve a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eyve eyveVar = new eyve();
        a = eyveVar;
        evsn.registerDefaultInstance(eyve.class, eyveVar);
    }

    private eyve() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eyvg.class});
        }
        if (iOrdinal == 3) {
            return new eyve();
        }
        if (iOrdinal == 4) {
            return new eyvd();
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
        synchronized (eyve.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
