package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enmb extends evsn implements evui {
    public static final enmb a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enmb enmbVar = new enmb();
        a = enmbVar;
        evsn.registerDefaultInstance(enmb.class, enmbVar);
    }

    private enmb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", enmn.class, enml.class, enmj.class, enmf.class, enmd.class, enmh.class});
        }
        if (iOrdinal == 3) {
            return new enmb();
        }
        if (iOrdinal == 4) {
            return new enma();
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
        synchronized (enmb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
