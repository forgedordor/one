package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbow extends evsn implements evui {
    public static final cbow a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public evtg d = evsn.emptyProtobufList();

    static {
        cbow cbowVar = new cbow();
        a = cbowVar;
        evsn.registerDefaultInstance(cbow.class, cbowVar);
    }

    private cbow() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003Ț", new Object[]{"b", "c", cbou.class, "d"});
        }
        if (iOrdinal == 3) {
            return new cbow();
        }
        if (iOrdinal == 4) {
            return new cbos();
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
        synchronized (cbow.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
