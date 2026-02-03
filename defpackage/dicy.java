package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dicy extends evsn implements evui {
    public static final dicy a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d = true;
    private int f;

    static {
        dicy dicyVar = new dicy();
        a = dicyVar;
        evsn.registerDefaultInstance(dicy.class, dicyVar);
    }

    private dicy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"f", "b", dicw.a, "c", dicu.a, "d"});
        }
        if (iOrdinal == 3) {
            return new dicy();
        }
        if (iOrdinal == 4) {
            return new dict();
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
        synchronized (dicy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
