package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojb extends evsn implements evui {
    public static final eojb a;
    private static volatile evuo g;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;

    static {
        eojb eojbVar = new eojb();
        a = eojbVar;
        evsn.registerDefaultInstance(eojb.class, eojbVar);
    }

    private eojb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eojb();
        }
        if (iOrdinal == 4) {
            return new eoja();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eojb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
