package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiay extends evsn implements evui {
    public static final aiay a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        aiay aiayVar = new aiay();
        a = aiayVar;
        evsn.registerDefaultInstance(aiay.class, aiayVar);
    }

    private aiay() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aiax.a});
        }
        if (iOrdinal == 3) {
            return new aiay();
        }
        if (iOrdinal == 4) {
            return new aiaw();
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
        synchronized (aiay.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
