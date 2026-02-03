package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefk extends evsn implements evui {
    public static final fefk a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public evta d = emptyLongList();

    static {
        fefk fefkVar = new fefk();
        a = fefkVar;
        evsn.registerDefaultInstance(fefk.class, fefkVar);
    }

    private fefk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new fefk();
        }
        if (iOrdinal == 4) {
            return new fefj();
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
        synchronized (fefk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
