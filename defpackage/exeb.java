package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exeb extends evsn implements evui {
    public static final exeb a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public evsx d = emptyIntList();
    public int e;

    static {
        exeb exebVar = new exeb();
        a = exebVar;
        evsn.registerDefaultInstance(exeb.class, exebVar);
    }

    private exeb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new exeb();
        }
        if (iOrdinal == 4) {
            return new exea();
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
        synchronized (exeb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
