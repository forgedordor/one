package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exfi extends evsn implements evui {
    public static final exfi a;
    private static volatile evuo f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        exfi exfiVar = new exfi();
        a = exfiVar;
        evsn.registerDefaultInstance(exfi.class, exfiVar);
    }

    private exfi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0002\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0001\u0005<\u0001", new Object[]{"c", "b", "e", "d", exhk.class, exhg.class, exhm.class, exhi.class});
        }
        if (iOrdinal == 3) {
            return new exfi();
        }
        if (iOrdinal == 4) {
            return new exfh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exfi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
