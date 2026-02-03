package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmf extends evsn implements evui {
    public static final evmf a;
    private static volatile evuo l;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public eybi f;
    public eybi g;
    public int h;
    public evll i;
    public evll j;
    public evly k;

    static {
        evmf evmfVar = new evmf();
        a = evmfVar;
        evsn.registerDefaultInstance(evmf.class, evmfVar);
    }

    private evmf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b<\u0000\t<\u0000", new Object[]{"d", "c", "b", "e", evmd.a, "f", "g", "h", evlz.a, "i", "j", "k", evmc.class, evmc.class});
        }
        if (iOrdinal == 3) {
            return new evmf();
        }
        if (iOrdinal == 4) {
            return new evlm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evmf.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
