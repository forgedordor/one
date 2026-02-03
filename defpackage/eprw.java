package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprw extends evsn implements evui {
    public static final eprw a;
    private static volatile evuo i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public evqs g;
    public evqs h;

    static {
        eprw eprwVar = new eprw();
        a = eprwVar;
        evsn.registerDefaultInstance(eprw.class, eprwVar);
    }

    private eprw() {
        evqs evqsVar = evqs.b;
        this.g = evqsVar;
        this.h = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004?\u0000\u0005?\u0000\u0006ည\u0003", new Object[]{"d", "c", "b", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eprw();
        }
        if (iOrdinal == 4) {
            return new eprv();
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
        synchronized (eprw.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
