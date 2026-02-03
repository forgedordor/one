package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eznx extends evsn implements evui {
    public static final eznx a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eznx eznxVar = new eznx();
        a = eznxVar;
        evsn.registerDefaultInstance(eznx.class, eznxVar);
    }

    private eznx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new eznx();
        }
        if (iOrdinal == 4) {
            return new eznw();
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
        synchronized (eznx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
