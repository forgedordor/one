package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxww extends evsn implements evui {
    public static final dxww a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dxww dxwwVar = new dxww();
        a = dxwwVar;
        evsn.registerDefaultInstance(dxww.class, dxwwVar);
    }

    private dxww() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", dxwr.class, dxwv.class, dxwt.class, dxwn.class, dxwp.class});
        }
        if (iOrdinal == 3) {
            return new dxww();
        }
        if (iOrdinal == 4) {
            return new dxwl();
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
        synchronized (dxww.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
