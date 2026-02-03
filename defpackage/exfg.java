package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exfg extends evsn implements evui {
    public static final exfg a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public evrj e;

    static {
        exfg exfgVar = new exfg();
        a = exfgVar;
        evsn.registerDefaultInstance(exfg.class, exfgVar);
    }

    private exfg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", exff.class, exfb.class, exen.class, exez.class, exfd.class});
        }
        if (iOrdinal == 3) {
            return new exfg();
        }
        if (iOrdinal == 4) {
            return new exel();
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
        synchronized (exfg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
