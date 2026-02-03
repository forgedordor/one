package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elua extends evsn implements evui {
    public static final elua a;
    private static volatile evuo e;
    public int b;
    public long c;
    public long d;

    static {
        elua eluaVar = new elua();
        a = eluaVar;
        evsn.registerDefaultInstance(elua.class, eluaVar);
    }

    private elua() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new elua();
        }
        if (iOrdinal == 4) {
            return new eltz();
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
        synchronized (elua.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
