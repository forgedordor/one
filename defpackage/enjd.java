package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enjd extends evsn implements evui {
    public static final enjd a;
    private static volatile evuo d;
    public int b;
    public enjb c;

    static {
        enjd enjdVar = new enjd();
        a = enjdVar;
        evsn.registerDefaultInstance(enjd.class, enjdVar);
    }

    private enjd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new enjd();
        }
        if (iOrdinal == 4) {
            return new enjc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enjd.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
