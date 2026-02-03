package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aucn extends evsn implements evui {
    public static final aucn a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        aucn aucnVar = new aucn();
        a = aucnVar;
        evsn.registerDefaultInstance(aucn.class, aucnVar);
    }

    private aucn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", auax.class, "c", augc.class});
        }
        if (iOrdinal == 3) {
            return new aucn();
        }
        if (iOrdinal == 4) {
            return new aucm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aucn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
