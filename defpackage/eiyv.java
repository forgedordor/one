package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyv extends evsn implements evui {
    public static final eiyv a;
    private static volatile evuo e;
    public String b = "";
    public evtg c = emptyProtobufList();
    public evtg d = emptyProtobufList();

    static {
        eiyv eiyvVar = new eiyv();
        a = eiyvVar;
        evsn.registerDefaultInstance(eiyv.class, eiyvVar);
    }

    private eiyv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"b", "c", eizi.class, "d", eiyx.class});
        }
        if (iOrdinal == 3) {
            return new eiyv();
        }
        if (iOrdinal == 4) {
            return new eiyu();
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
        synchronized (eiyv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
