package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epis extends evsn implements evui {
    public static final epis a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public int c;

    static {
        epis episVar = new epis();
        a = episVar;
        evsn.registerDefaultInstance(epis.class, episVar);
    }

    private epis() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", epir.class, "c"});
        }
        if (iOrdinal == 3) {
            return new epis();
        }
        if (iOrdinal == 4) {
            return new epip();
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
        synchronized (epis.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
