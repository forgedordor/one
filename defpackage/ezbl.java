package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezbl extends evsn implements evui {
    public static final ezbl a;
    private static volatile evuo b;

    static {
        ezbl ezblVar = new ezbl();
        a = ezblVar;
        evsn.registerDefaultInstance(ezbl.class, ezblVar);
    }

    private ezbl() {
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
            return new ezbl();
        }
        if (iOrdinal == 4) {
            return new ezbk();
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
        synchronized (ezbl.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
