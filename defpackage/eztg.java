package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eztg extends evsn implements evui {
    public static final eztg a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public ezol d;
    public String e = "";
    public ezpx f;

    static {
        eztg eztgVar = new eztg();
        a = eztgVar;
        evsn.registerDefaultInstance(eztg.class, eztgVar);
    }

    private eztg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eztg();
        }
        if (iOrdinal == 4) {
            return new eztf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eztg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
