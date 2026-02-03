package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enjm extends evsn implements evui {
    public static final enjm a;
    private static volatile evuo b;

    static {
        enjm enjmVar = new enjm();
        a = enjmVar;
        evsn.registerDefaultInstance(enjm.class, enjmVar);
    }

    private enjm() {
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
            return new enjm();
        }
        if (iOrdinal == 4) {
            return new enjl();
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
        synchronized (enjm.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
