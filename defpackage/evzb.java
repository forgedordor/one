package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evzb extends evsn<evzb, evza> implements evui {
    public static final evzb a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d;

    static {
        evzb evzbVar = new evzb();
        a = evzbVar;
        evsn.registerDefaultInstance(evzb.class, evzbVar);
    }

    private evzb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new evzb();
        }
        if (iOrdinal == 4) {
            return new evza();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evzb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
