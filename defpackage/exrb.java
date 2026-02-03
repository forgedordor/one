package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exrb extends evsn implements evui {
    public static final exrb a;
    private static volatile evuo c;
    public int b;

    static {
        exrb exrbVar = new exrb();
        a = exrbVar;
        evsn.registerDefaultInstance(exrb.class, exrbVar);
    }

    private exrb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new exrb();
        }
        if (iOrdinal == 4) {
            return new exra();
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
        synchronized (exrb.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
