package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpt extends evsn implements evui {
    public static final enpt a;
    private static volatile evuo i;
    public int b;
    public evqs c = evqs.b;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    static {
        enpt enptVar = new enpt();
        a = enptVar;
        evsn.registerDefaultInstance(enpt.class, enptVar);
    }

    private enpt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new enpt();
        }
        if (iOrdinal == 4) {
            return new enps();
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
        synchronized (enpt.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
