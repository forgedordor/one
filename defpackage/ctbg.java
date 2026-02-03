package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbg extends evsn implements evui {
    public static final ctbg a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        ctbg ctbgVar = new ctbg();
        a = ctbgVar;
        evsn.registerDefaultInstance(ctbg.class, ctbgVar);
    }

    private ctbg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", ctav.class, ctbd.class});
        }
        if (iOrdinal == 3) {
            return new ctbg();
        }
        if (iOrdinal == 4) {
            return new ctbe();
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
        synchronized (ctbg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
