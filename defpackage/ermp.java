package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermp extends evsn implements evui {
    public static final ermp a;
    private static volatile evuo d;
    public int b;
    public evtg c = emptyProtobufList();

    static {
        ermp ermpVar = new ermp();
        a = ermpVar;
        evsn.registerDefaultInstance(ermp.class, ermpVar);
    }

    private ermp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", ermo.class});
        }
        if (iOrdinal == 3) {
            return new ermp();
        }
        if (iOrdinal == 4) {
            return new ermm();
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
        synchronized (ermp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
