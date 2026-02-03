package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cidp extends evsn implements evui {
    public static final cidp a;
    private static volatile evuo b;

    static {
        cidp cidpVar = new cidp();
        a = cidpVar;
        evsn.registerDefaultInstance(cidp.class, cidpVar);
    }

    private cidp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new cidp();
        }
        if (iOrdinal == 4) {
            return new cido();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cidp.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
