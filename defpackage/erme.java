package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erme extends evsn implements evui {
    public static final erme a;
    private static volatile evuo e;
    public String b = "";
    public evqs c = evqs.b;
    public int d;

    static {
        erme ermeVar = new erme();
        a = ermeVar;
        evsn.registerDefaultInstance(erme.class, ermeVar);
    }

    private erme() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new erme();
        }
        if (iOrdinal == 4) {
            return new ermc();
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
        synchronized (erme.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
