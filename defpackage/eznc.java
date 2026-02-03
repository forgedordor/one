package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eznc extends evsn implements evui {
    public static final eznc a;
    private static volatile evuo c;
    public ezpr b;
    private int d;

    static {
        eznc ezncVar = new eznc();
        a = ezncVar;
        evsn.registerDefaultInstance(eznc.class, ezncVar);
    }

    private eznc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eznc();
        }
        if (iOrdinal == 4) {
            return new eznb();
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
        synchronized (eznc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
