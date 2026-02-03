package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adju extends evsn implements evui {
    public static final adju a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public evvp e;

    static {
        adju adjuVar = new adju();
        a = adjuVar;
        evsn.registerDefaultInstance(adju.class, adjuVar);
    }

    private adju() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new adju();
        }
        if (iOrdinal == 4) {
            return new adjt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (adju.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
