package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exeu extends evsn implements evui {
    public static final exeu a;
    private static volatile evuo d;
    public int b;
    public exew c;

    static {
        exeu exeuVar = new exeu();
        a = exeuVar;
        evsn.registerDefaultInstance(exeu.class, exeuVar);
    }

    private exeu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new exeu();
        }
        if (iOrdinal == 4) {
            return new exet();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exeu.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
