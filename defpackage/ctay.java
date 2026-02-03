package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctay extends evsn implements evui {
    public static final ctay a;
    private static volatile evuo f;
    public evvp b;
    public String c = "";
    public int d;
    public int e;
    private int g;

    static {
        ctay ctayVar = new ctay();
        a = ctayVar;
        evsn.registerDefaultInstance(ctay.class, ctayVar);
    }

    private ctay() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004\u0004\f", new Object[]{"g", "c", "b", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ctay();
        }
        if (iOrdinal == 4) {
            return new ctaw();
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
        synchronized (ctay.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
