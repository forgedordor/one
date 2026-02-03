package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chvd extends evsn implements evui {
    public static final chvd a;
    private static volatile evuo b;

    static {
        chvd chvdVar = new chvd();
        a = chvdVar;
        evsn.registerDefaultInstance(chvd.class, chvdVar);
    }

    private chvd() {
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
            return new chvd();
        }
        if (iOrdinal == 4) {
            return new chvc();
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
        synchronized (chvd.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
