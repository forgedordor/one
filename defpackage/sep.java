package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sep extends evsn implements evui {
    public static final sep a;
    private static volatile evuo h;
    public int b;
    public int c;
    public long d;
    public sdt e;
    public int f;
    public int g;

    static {
        sep sepVar = new sep();
        a = sepVar;
        evsn.registerDefaultInstance(sep.class, sepVar);
    }

    private sep() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", sfk.a, "d", "e", "f", sfm.a, "g", sfc.a});
        }
        if (iOrdinal == 3) {
            return new sep();
        }
        if (iOrdinal == 4) {
            return new seo();
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
        synchronized (sep.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
