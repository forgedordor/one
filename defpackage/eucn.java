package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eucn extends evsn implements evui {
    public static final eucn a;
    private static volatile evuo b;

    static {
        eucn eucnVar = new eucn();
        a = eucnVar;
        evsn.registerDefaultInstance(eucn.class, eucnVar);
    }

    private eucn() {
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
            return new eucn();
        }
        if (iOrdinal == 4) {
            return new eucm();
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
        synchronized (eucn.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
