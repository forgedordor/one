package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrk extends evsn implements evui {
    public static final dtrk a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    static {
        dtrk dtrkVar = new dtrk();
        a = dtrkVar;
        evsn.registerDefaultInstance(dtrk.class, dtrkVar);
    }

    private dtrk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004ဂ\u0002", new Object[]{"b", "c", dtri.a, "d", dtrg.a, "f", dtrd.a, "e"});
        }
        if (iOrdinal == 3) {
            return new dtrk();
        }
        if (iOrdinal == 4) {
            return new dtrf();
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
        synchronized (dtrk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
