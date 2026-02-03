package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizf extends evsn implements evui {
    public static final eizf a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eizf eizfVar = new eizf();
        a = eizfVar;
        evsn.registerDefaultInstance(eizf.class, eizfVar);
    }

    private eizf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eize.class});
        }
        if (iOrdinal == 3) {
            return new eizf();
        }
        if (iOrdinal == 4) {
            return new eizc();
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
        synchronized (eizf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
