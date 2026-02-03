package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypr extends evsn implements evui {
    public static final eypr a;
    private static volatile evuo h;
    public int b;
    public int d;
    public int e;
    public eyax f;
    public evqs c = evqs.b;
    public String g = "";

    static {
        eypr eyprVar = new eypr();
        a = eyprVar;
        evsn.registerDefaultInstance(eypr.class, eyprVar);
    }

    private eypr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004\u0004ဉ\u0000\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eypr();
        }
        if (iOrdinal == 4) {
            return new eypq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eypr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
