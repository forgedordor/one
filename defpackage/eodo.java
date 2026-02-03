package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodo extends evsn implements evui {
    public static final eodo a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        eodo eodoVar = new eodo();
        a = eodoVar;
        evsn.registerDefaultInstance(eodo.class, eodoVar);
    }

    private eodo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004င\u0003\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eodo();
        }
        if (iOrdinal == 4) {
            return new eodn();
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
        synchronized (eodo.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
