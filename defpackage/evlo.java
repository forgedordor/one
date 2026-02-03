package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evlo extends evsn implements evui {
    public static final evlo a;
    private static volatile evuo h;
    public int b;
    public eybi c;
    public boolean d;
    public evll e;
    public evll f;
    public int g;

    static {
        evlo evloVar = new evlo();
        a = evloVar;
        evsn.registerDefaultInstance(evlo.class, evloVar);
    }

    private evlo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004᠌\u0004\u0005ဇ\u0001", new Object[]{"b", "c", "e", "f", "g", evli.a, "d"});
        }
        if (iOrdinal == 3) {
            return new evlo();
        }
        if (iOrdinal == 4) {
            return new evln();
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
        synchronized (evlo.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
