package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdjt extends evsn implements evui {
    public static final cdjt a;
    private static volatile evuo k;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public evvp g;
    public boolean h;
    public boolean i;
    public int j;

    static {
        cdjt cdjtVar = new cdjt();
        a = cdjtVar;
        evsn.registerDefaultInstance(cdjt.class, cdjtVar);
    }

    private cdjt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\tဇ\b\n᠌\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", cdjr.a});
        }
        if (iOrdinal == 3) {
            return new cdjt();
        }
        if (iOrdinal == 4) {
            return new cdjq();
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
        synchronized (cdjt.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
