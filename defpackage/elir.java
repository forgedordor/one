package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elir extends evsn implements evui {
    public static final elir a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        elir elirVar = new elir();
        a = elirVar;
        evsn.registerDefaultInstance(elir.class, elirVar);
    }

    private elir() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", enmu.class, enmw.class});
        }
        if (iOrdinal == 3) {
            return new elir();
        }
        if (iOrdinal == 4) {
            return new eliq();
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
        synchronized (elir.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
