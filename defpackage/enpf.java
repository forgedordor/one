package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpf extends evsn implements evui {
    public static final enpf a;
    private static volatile evuo h;
    public int b;
    public evrj c;
    public enpd d;
    public enpd e;
    public evqs f = evqs.b;
    public int g;

    static {
        enpf enpfVar = new enpf();
        a = enpfVar;
        evsn.registerDefaultInstance(enpf.class, enpfVar);
    }

    private enpf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", enpe.a});
        }
        if (iOrdinal == 3) {
            return new enpf();
        }
        if (iOrdinal == 4) {
            return new enpb();
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
        synchronized (enpf.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
