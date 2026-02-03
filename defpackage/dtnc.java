package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnc extends evsn implements evui {
    public static final dtnc a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        dtnc dtncVar = new dtnc();
        a = dtncVar;
        evsn.registerDefaultInstance(dtnc.class, dtncVar);
    }

    private dtnc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dtnb.a});
        }
        if (iOrdinal == 3) {
            return new dtnc();
        }
        if (iOrdinal == 4) {
            return new dtna();
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
        synchronized (dtnc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
