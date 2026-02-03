package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exfy extends evsn implements evui {
    public static final exfy a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        exfy exfyVar = new exfy();
        a = exfyVar;
        evsn.registerDefaultInstance(exfy.class, exfyVar);
    }

    private exfy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", exfr.class, exfn.class, exfx.class, exft.class, exfp.class, exfv.class});
        }
        if (iOrdinal == 3) {
            return new exfy();
        }
        if (iOrdinal == 4) {
            return new exfl();
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
        synchronized (exfy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
