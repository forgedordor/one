package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxs extends evsn<efxs, efxp> implements evui {
    public static final efxs a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int e;
    public evtg f = evsn.emptyProtobufList();
    public boolean g;
    public int h;
    public boolean i;
    public int j;

    static {
        efxs efxsVar = new efxs();
        a = efxsVar;
        evsn.registerDefaultInstance(efxs.class, efxsVar);
    }

    private efxs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004\u001a\u0005ဇ\u0003\u0006င\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"b", "c", "d", "e", efxq.a, "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new efxs();
        }
        if (iOrdinal == 4) {
            return new efxp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (efxs.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
