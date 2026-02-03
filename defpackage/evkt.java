package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkt extends evsn implements evui {
    public static final evkt a;
    private static volatile evuo g;
    public int b;
    public long c;
    public evrj d;
    public evrj e;
    public boolean f;

    static {
        evkt evktVar = new evkt();
        a = evktVar;
        evsn.registerDefaultInstance(evkt.class, evktVar);
    }

    private evkt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new evkt();
        }
        if (iOrdinal == 4) {
            return new evks();
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
        synchronized (evkt.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
