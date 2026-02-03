package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezer extends evsn implements evui {
    public static final ezer a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d;
    public float e;
    public eybg f;
    public evtg g;

    static {
        ezer ezerVar = new ezer();
        a = ezerVar;
        evsn.registerDefaultInstance(ezer.class, ezerVar);
    }

    private ezer() {
        emptyIntList();
        this.d = "";
        this.g = evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\t\u000e\u0005\u0000\u0001\u0000\tȈ\u000bȈ\f\u0001\rဉ\u0000\u000eȚ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezer();
        }
        if (iOrdinal == 4) {
            return new ezeq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezer.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
