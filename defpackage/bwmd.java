package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwmd extends evsn implements evui {
    public static final bwmd a;
    private static volatile evuo c;
    public evtg b;

    static {
        bwmd bwmdVar = new bwmd();
        a = bwmdVar;
        evsn.registerDefaultInstance(bwmd.class, bwmdVar);
    }

    private bwmd() {
        evsn.emptyProtobufList();
        this.b = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", bwmc.class});
        }
        if (iOrdinal == 3) {
            return new bwmd();
        }
        if (iOrdinal == 4) {
            return new bwma();
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
        synchronized (bwmd.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
