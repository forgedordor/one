package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqok extends evsn implements evui {
    public static final eqok a;
    private static volatile evuo g;
    public int b;
    public eqny c;
    public eqnd d;
    public evrw e;
    public eqmi f;

    static {
        eqok eqokVar = new eqok();
        a = eqokVar;
        evsn.registerDefaultInstance(eqok.class, eqokVar);
    }

    private eqok() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003ϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (iOrdinal == 3) {
            return new eqok();
        }
        if (iOrdinal == 4) {
            return new eqoj();
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
        synchronized (eqok.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
