package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobe extends evsn implements evui {
    public static final eobe a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evtg d;

    static {
        eobe eobeVar = new eobe();
        a = eobeVar;
        evsn.registerDefaultInstance(eobe.class, eobeVar);
    }

    private eobe() {
        evsn.emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001b", new Object[]{"b", "c", emok.a, "d", eobd.class});
        }
        if (iOrdinal == 3) {
            return new eobe();
        }
        if (iOrdinal == 4) {
            return new eobb();
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
        synchronized (eobe.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
