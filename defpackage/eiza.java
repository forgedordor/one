package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiza extends evsn implements evui {
    public static final eiza a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eiza eizaVar = new eiza();
        a = eizaVar;
        evsn.registerDefaultInstance(eiza.class, eizaVar);
    }

    private eiza() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eiyz.class});
        }
        if (iOrdinal == 3) {
            return new eiza();
        }
        if (iOrdinal == 4) {
            return new eiys();
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
        synchronized (eiza.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
