package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezbu extends evsn implements evui {
    public static final ezbu a;
    private static volatile evuo b;

    static {
        ezbu ezbuVar = new ezbu();
        a = ezbuVar;
        evsn.registerDefaultInstance(ezbu.class, ezbuVar);
    }

    private ezbu() {
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
            return new ezbu();
        }
        if (iOrdinal == 4) {
            return new ezbt();
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
        synchronized (ezbu.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
