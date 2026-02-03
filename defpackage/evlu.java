package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evlu extends evsn implements evui {
    public static final evlu a;
    private static volatile evuo l;
    public int b;
    public int c = 0;
    public Object d;
    public eybi e;
    public boolean f;
    public int g;
    public evll h;
    public evll i;
    public int j;
    public int k;

    static {
        evlu evluVar = new evlu();
        a = evluVar;
        evsn.registerDefaultInstance(evlu.class, evluVar);
    }

    private evlu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003<\u0000\u0004;\u0000\u0006᠌\u0002\u0007ဉ\u0003\bဉ\u0004\t᠌\u0005\n᠌\u0006\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", "f", evno.class, "g", evlq.a, "h", "i", "j", evli.a, "k", evls.a, evnw.class, evmz.class});
        }
        if (iOrdinal == 3) {
            return new evlu();
        }
        if (iOrdinal == 4) {
            return new evlp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evlu.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
