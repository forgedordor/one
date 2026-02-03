package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbd extends evsn implements evui {
    public static final ctbd a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ctbd ctbdVar = new ctbd();
        a = ctbdVar;
        evsn.registerDefaultInstance(ctbd.class, ctbdVar);
    }

    private ctbd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cszt.class});
        }
        if (iOrdinal == 3) {
            return new ctbd();
        }
        if (iOrdinal == 4) {
            return new ctbc();
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
        synchronized (ctbd.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
