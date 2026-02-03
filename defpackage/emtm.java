package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emtm extends evsn implements evui {
    public static final emtm a;
    private static volatile evuo b;

    static {
        emtm emtmVar = new emtm();
        a = emtmVar;
        evsn.registerDefaultInstance(emtm.class, emtmVar);
    }

    private emtm() {
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
            return new emtm();
        }
        if (iOrdinal == 4) {
            return new emtl();
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
        synchronized (emtm.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
