package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aumf extends evsn implements evui {
    public static final aumf a;
    private static volatile evuo g;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    static {
        aumf aumfVar = new aumf();
        a = aumfVar;
        evsn.registerDefaultInstance(aumf.class, aumfVar);
    }

    private aumf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aumf();
        }
        if (iOrdinal == 4) {
            return new aume();
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
        synchronized (aumf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
