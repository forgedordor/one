package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eytq extends evsn implements evui {
    public static final eytq a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        eytq eytqVar = new eytq();
        a = eytqVar;
        evsn.registerDefaultInstance(eytq.class, eytqVar);
    }

    private eytq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000g<\u0000", new Object[]{"c", "b", "d", eyty.class, eyuc.class, eytg.class});
        }
        if (iOrdinal == 3) {
            return new eytq();
        }
        if (iOrdinal == 4) {
            return new eytp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eytq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
