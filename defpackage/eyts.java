package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyts extends evsn implements evui {
    public static final eyts a;
    private static volatile evuo g;
    public int b;
    public eysd c;
    public int d;
    public int e;
    public String f = "";

    static {
        eyts eytsVar = new eyts();
        a = eytsVar;
        evsn.registerDefaultInstance(eyts.class, eytsVar);
    }

    private eyts() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eyts();
        }
        if (iOrdinal == 4) {
            return new eytr();
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
        synchronized (eyts.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
