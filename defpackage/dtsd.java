package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtsd extends evsn implements evui {
    public static final dtsd a;
    private static volatile evuo h;
    public int b;
    public long d;
    public int f;
    public exyx g;
    public String c = "";
    public String e = "";

    static {
        dtsd dtsdVar = new dtsd();
        a = dtsdVar;
        evsn.registerDefaultInstance(dtsd.class, dtsdVar);
    }

    private dtsd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", dtqv.a, "g"});
        }
        if (iOrdinal == 3) {
            return new dtsd();
        }
        if (iOrdinal == 4) {
            return new dtsc();
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
        synchronized (dtsd.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
