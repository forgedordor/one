package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvg extends evsn implements evui {
    public static final csvg a;
    private static volatile evuo f;
    public int b;
    public evqs c;
    public evqs d;
    public evvp e;

    static {
        csvg csvgVar = new csvg();
        a = csvgVar;
        evsn.registerDefaultInstance(csvg.class, csvgVar);
    }

    private csvg() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001\n\u0002\n\bဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new csvg();
        }
        if (iOrdinal == 4) {
            return new csvf();
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
        synchronized (csvg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
