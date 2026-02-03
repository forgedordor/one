package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epoj extends evsn implements evui {
    public static final epoj a;
    private static volatile evuo b;

    static {
        epoj epojVar = new epoj();
        a = epojVar;
        evsn.registerDefaultInstance(epoj.class, epojVar);
    }

    private epoj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new epoj();
        }
        if (iOrdinal == 4) {
            return new epoi();
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
        synchronized (epoj.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
