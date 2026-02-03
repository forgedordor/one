package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exyv extends evsn implements evui {
    public static final exyv a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        exyv exyvVar = new exyv();
        a = exyvVar;
        evsn.registerDefaultInstance(exyv.class, exyvVar);
    }

    private exyv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", exyj.class, exyr.class, exyt.class, exyz.class, exyn.class, exyp.class});
        }
        if (iOrdinal == 3) {
            return new exyv();
        }
        if (iOrdinal == 4) {
            return new exyu();
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
        synchronized (exyv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
