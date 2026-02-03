package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbm extends evsn implements evui {
    public static final dsbm a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dsbm dsbmVar = new dsbm();
        a = dsbmVar;
        evsn.registerDefaultInstance(dsbm.class, dsbmVar);
    }

    private dsbm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", etkl.class, dsbq.class});
        }
        if (iOrdinal == 3) {
            return new dsbm();
        }
        if (iOrdinal == 4) {
            return new dsbl();
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
        synchronized (dsbm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
