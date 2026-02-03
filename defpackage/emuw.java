package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emuw extends evsn implements evui {
    public static final emuw a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        emuw emuwVar = new emuw();
        a = emuwVar;
        evsn.registerDefaultInstance(emuw.class, emuwVar);
    }

    private emuw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", emuy.class, "c", emvc.class});
        }
        if (iOrdinal == 3) {
            return new emuw();
        }
        if (iOrdinal == 4) {
            return new emuv();
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
        synchronized (emuw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
