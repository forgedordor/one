package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyp extends evsn implements evui {
    public static final euyp a;
    private static volatile evuo h;
    public int b;
    public float e;
    public String c = "en";
    public int d = -1;
    public evtg f = evsn.emptyProtobufList();
    public evtg g = evsn.emptyProtobufList();

    static {
        euyp euypVar = new euyp();
        a = euypVar;
        evsn.registerDefaultInstance(euyp.class, euypVar);
    }

    private euyp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a\u0005\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new euyp();
        }
        if (iOrdinal == 4) {
            return new euyo();
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
        synchronized (euyp.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
