package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpr extends evsn implements evui {
    public static final enpr a;
    private static volatile evuo i;
    public int b;
    public evqs c;
    public evrj d;
    public evrj e;
    public evqs f;
    public int g;
    public int h;

    static {
        enpr enprVar = new enpr();
        a = enprVar;
        evsn.registerDefaultInstance(enpr.class, enprVar);
    }

    private enpr() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
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
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005᠌\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", enpq.a, "h"});
        }
        if (iOrdinal == 3) {
            return new enpr();
        }
        if (iOrdinal == 4) {
            return new enpp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enpr.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
