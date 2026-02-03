package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpy extends evsn implements evui {
    public static final etpy a;
    private static volatile evuo h;
    public int b;
    public etqq c;
    public etqg d;
    public evqs e = evqs.b;
    public etra f;
    public int g;

    static {
        etpy etpyVar = new etpy();
        a = etpyVar;
        evsn.registerDefaultInstance(etpy.class, etpyVar);
    }

    private etpy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\n\u0007ဉ\u0002\b\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new etpy();
        }
        if (iOrdinal == 4) {
            return new etpx();
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
        synchronized (etpy.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
