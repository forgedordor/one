package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epda extends evsn implements evui {
    public static final epda a;
    private static volatile evuo e;
    public int b;
    public ckmb c;
    public evtg d = evsn.emptyProtobufList();

    static {
        epda epdaVar = new epda();
        a = epdaVar;
        evsn.registerDefaultInstance(epda.class, epdaVar);
    }

    private epda() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epda();
        }
        if (iOrdinal == 4) {
            return new epcz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epda.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
