package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dscw extends evsn implements evui {
    public static final dscw a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        dscw dscwVar = new dscw();
        a = dscwVar;
        evsn.registerDefaultInstance(dscw.class, dscwVar);
    }

    private dscw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dsde.class});
        }
        if (iOrdinal == 3) {
            return new dscw();
        }
        if (iOrdinal == 4) {
            return new dscv();
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
        synchronized (dscw.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
