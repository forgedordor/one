package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exsp extends evsn implements evui {
    public static final exsp a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        exsp exspVar = new exsp();
        a = exspVar;
        evsn.registerDefaultInstance(exsp.class, exspVar);
    }

    private exsp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဈ\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exsp();
        }
        if (iOrdinal == 4) {
            return new exso();
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
        synchronized (exsp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
