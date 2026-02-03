package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhk extends evsn implements evui {
    public static final bxhk a;
    private static volatile evuo d;
    public int b;
    public evtg c = evsn.emptyProtobufList();

    static {
        bxhk bxhkVar = new bxhk();
        a = bxhkVar;
        evsn.registerDefaultInstance(bxhk.class, bxhkVar);
    }

    private bxhk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u0004\u0004Ț", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bxhk();
        }
        if (iOrdinal == 4) {
            return new bxhj();
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
        synchronized (bxhk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
