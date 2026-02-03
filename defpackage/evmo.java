package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmo extends evsn implements evui {
    public static final evmo a;
    private static volatile evuo k;
    public int b;
    public int c = 0;
    public Object d;
    public eybi e;
    public eybi f;
    public evll g;
    public evll h;
    public evmj i;
    public int j;

    static {
        evmo evmoVar = new evmo();
        a = evmoVar;
        evsn.registerDefaultInstance(evmo.class, evmoVar);
    }

    private evmo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006;\u0000\u0007;\u0000\b7\u0000\t᠌\u0005", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", evmm.a});
        }
        if (iOrdinal == 3) {
            return new evmo();
        }
        if (iOrdinal == 4) {
            return new evmk();
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
        synchronized (evmo.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
