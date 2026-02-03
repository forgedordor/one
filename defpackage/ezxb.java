package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezxb extends evsn implements evui {
    public static final ezxb a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ezxb ezxbVar = new ezxb();
        a = ezxbVar;
        evsn.registerDefaultInstance(ezxb.class, ezxbVar);
    }

    private ezxb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", ezxj.class, ezxj.class, ezwy.class, ezxf.class, ezxh.class, ezxl.class, ezww.class, ezxd.class, ezwu.class});
        }
        if (iOrdinal == 3) {
            return new ezxb();
        }
        if (iOrdinal == 4) {
            return new ezxa();
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
        synchronized (ezxb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
