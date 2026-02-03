package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aspr extends evsn implements evui {
    public static final aspr a;
    private static volatile evuo c;
    public String b = "";
    private boolean d;

    static {
        aspr asprVar = new aspr();
        a = asprVar;
        evsn.registerDefaultInstance(aspr.class, asprVar);
    }

    private aspr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003Ȉ", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new aspr();
        }
        if (iOrdinal == 4) {
            return new aspq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aspr.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
