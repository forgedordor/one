package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class facu extends evsn implements evui {
    public static final facu a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public evtg d = emptyProtobufList();
    public int e;
    public int f;

    static {
        facu facuVar = new facu();
        a = facuVar;
        evsn.registerDefaultInstance(facu.class, facuVar);
    }

    private facu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\f\u0004\f", new Object[]{"b", "c", "d", ezol.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new facu();
        }
        if (iOrdinal == 4) {
            return new fact();
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
        synchronized (facu.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
