package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqng extends evsn implements evui {
    public static final eqng a;
    private static volatile evuo h;
    public int b;
    public long d;
    public evtg g;
    public String c = "";
    public String e = "";
    public evtg f = evsn.emptyProtobufList();

    static {
        eqng eqngVar = new eqng();
        a = eqngVar;
        evsn.registerDefaultInstance(eqng.class, eqngVar);
    }

    private eqng() {
        evsn.emptyProtobufList();
        this.g = evsn.emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u000e\u0006\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0004\u0003\u0005Ȉ\bȚ\u000eȚ", new Object[]{"b", "c", "d", "e", "g", "f"});
        }
        if (iOrdinal == 3) {
            return new eqng();
        }
        if (iOrdinal == 4) {
            return new eqne();
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
        synchronized (eqng.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
