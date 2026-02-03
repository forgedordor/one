package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enei extends evsn implements evui {
    public static final enei a;
    private static volatile evuo b;

    static {
        enei eneiVar = new enei();
        a = eneiVar;
        evsn.registerDefaultInstance(enei.class, eneiVar);
    }

    private enei() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new enei();
        }
        if (iOrdinal == 4) {
            return new eneh();
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
        synchronized (enei.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
