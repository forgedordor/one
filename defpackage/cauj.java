package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauj extends evsn implements evui {
    public static final cauj a;
    private static volatile evuo e;
    public String b = "";
    public long c;
    public long d;

    static {
        cauj caujVar = new cauj();
        a = caujVar;
        evsn.registerDefaultInstance(cauj.class, caujVar);
    }

    private cauj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cauj();
        }
        if (iOrdinal == 4) {
            return new caui();
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
        synchronized (cauj.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
