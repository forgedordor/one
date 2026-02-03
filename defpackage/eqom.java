package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqom extends evsn implements evui {
    public static final eqom a;
    private static volatile evuo f;
    public int b;
    public eqny c;
    public eqnl d;
    public evrw e;

    static {
        eqom eqomVar = new eqom();
        a = eqomVar;
        evsn.registerDefaultInstance(eqom.class, eqomVar);
    }

    private eqom() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001ϧ\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new eqom();
        }
        if (iOrdinal == 4) {
            return new eqol();
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
        synchronized (eqom.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
