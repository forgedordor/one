package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evms extends evsn implements evui {
    public static final evms a;
    private static volatile evuo i;
    public int b;
    public evmo c;
    public evll d;
    public evll e;
    public int f;
    public float g = 1.0f;
    public boolean h;

    static {
        evms evmsVar = new evms();
        a = evmsVar;
        evsn.registerDefaultInstance(evms.class, evmsVar);
    }

    private evms() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", evmq.a, "g", "h"});
        }
        if (iOrdinal == 3) {
            return new evms();
        }
        if (iOrdinal == 4) {
            return new evmp();
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
        synchronized (evms.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
