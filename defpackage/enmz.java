package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enmz extends evsn implements evui {
    public static final enmz a;
    private static volatile evuo b;

    static {
        enmz enmzVar = new enmz();
        a = enmzVar;
        evsn.registerDefaultInstance(enmz.class, enmzVar);
    }

    private enmz() {
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
            return new enmz();
        }
        if (iOrdinal == 4) {
            return new enmy();
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
        synchronized (enmz.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
