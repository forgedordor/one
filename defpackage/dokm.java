package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokm extends evsn implements evui {
    public static final dokm a;
    private static volatile evuo b;

    static {
        dokm dokmVar = new dokm();
        a = dokmVar;
        evsn.registerDefaultInstance(dokm.class, dokmVar);
    }

    private dokm() {
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
            return new dokm();
        }
        if (iOrdinal == 4) {
            return new dokl();
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
        synchronized (dokm.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
