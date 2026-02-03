package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegw extends evsn implements evui {
    public static final fegw a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public long d;
    public evta e;

    static {
        fegw fegwVar = new fegw();
        a = fegwVar;
        evsn.registerDefaultInstance(fegw.class, fegwVar);
    }

    private fegw() {
        emptyLongList();
        this.e = emptyLongList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0004\u0015", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new fegw();
        }
        if (iOrdinal == 4) {
            return new fegv();
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
        synchronized (fegw.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
