package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedg extends evsn implements evui {
    public static final fedg a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public fecy e;

    static {
        fedg fedgVar = new fedg();
        a = fedgVar;
        evsn.registerDefaultInstance(fedg.class, fedgVar);
    }

    private fedg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new fedg();
        }
        if (iOrdinal == 4) {
            return new fedf();
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
        synchronized (fedg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
