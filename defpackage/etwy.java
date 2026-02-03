package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwy extends evsn implements evui {
    public static final etwy a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public evtg e = emptyProtobufList();

    static {
        etwy etwyVar = new etwy();
        a = etwyVar;
        evsn.registerDefaultInstance(etwy.class, etwyVar);
    }

    private etwy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", etwu.class});
        }
        if (iOrdinal == 3) {
            return new etwy();
        }
        if (iOrdinal == 4) {
            return new etwx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etwy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
