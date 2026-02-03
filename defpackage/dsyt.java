package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyt extends evsn implements evui {
    public static final dsyt a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        dsyt dsytVar = new dsyt();
        a = dsytVar;
        evsn.registerDefaultInstance(dsyt.class, dsytVar);
    }

    private dsyt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new dsyt();
        }
        if (iOrdinal == 4) {
            return new dsys();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dsyt.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
