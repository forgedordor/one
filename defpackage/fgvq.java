package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvq extends evsn implements evui {
    public static final fgvq a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        fgvq fgvqVar = new fgvq();
        a = fgvqVar;
        evsn.registerDefaultInstance(fgvq.class, fgvqVar);
    }

    private fgvq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", fgvp.a});
        }
        if (iOrdinal == 3) {
            return new fgvq();
        }
        if (iOrdinal == 4) {
            return new fgvo();
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
        synchronized (fgvq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
