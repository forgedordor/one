package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklt extends evsn implements evui {
    public static final cklt a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        cklt ckltVar = new cklt();
        a = ckltVar;
        evsn.registerDefaultInstance(cklt.class, ckltVar);
    }

    private cklt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ckls.a});
        }
        if (iOrdinal == 3) {
            return new cklt();
        }
        if (iOrdinal == 4) {
            return new cklr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cklt.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
