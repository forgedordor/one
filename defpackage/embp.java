package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class embp extends evsn implements evui {
    public static final embp a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        embp embpVar = new embp();
        a = embpVar;
        evsn.registerDefaultInstance(embp.class, embpVar);
    }

    private embp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", embn.a});
        }
        if (iOrdinal == 3) {
            return new embp();
        }
        if (iOrdinal == 4) {
            return new embl();
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
        synchronized (embp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
