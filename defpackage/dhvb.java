package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvb extends evsn implements evui {
    public static final dhvb a;
    private static volatile evuo f;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    static {
        dhvb dhvbVar = new dhvb();
        a = dhvbVar;
        evsn.registerDefaultInstance(dhvb.class, dhvbVar);
    }

    private dhvb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", dhvg.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dhvb();
        }
        if (iOrdinal == 4) {
            return new dhva();
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
        synchronized (dhvb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
