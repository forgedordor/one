package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exva extends evsn implements evui {
    public static final exva a;
    private static volatile evuo g;
    public int b;
    public int c;
    public evqs d;
    public int e;
    public evqs f;

    static {
        exva exvaVar = new exva();
        a = exvaVar;
        evsn.registerDefaultInstance(exva.class, exvaVar);
    }

    private exva() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.f = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003᠌\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", exut.a, "f"});
        }
        if (iOrdinal == 3) {
            return new exva();
        }
        if (iOrdinal == 4) {
            return new exuz();
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
        synchronized (exva.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
