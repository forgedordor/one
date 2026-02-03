package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtsf extends evsn implements evui {
    public static final dtsf a;
    private static volatile evuo e;
    public int b;
    public long c;
    public evvp d;

    static {
        dtsf dtsfVar = new dtsf();
        a = dtsfVar;
        evsn.registerDefaultInstance(dtsf.class, dtsfVar);
    }

    private dtsf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dtsf();
        }
        if (iOrdinal == 4) {
            return new dtse();
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
        synchronized (dtsf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
