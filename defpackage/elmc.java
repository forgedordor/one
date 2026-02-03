package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmc extends evsn implements evui {
    public static final evsy a = new ellt();
    public static final elmc b;
    private static volatile evuo r;
    public int c;
    public int d;
    public int e;
    public elly f;
    public elpy g;
    public int h;
    public elma i;
    public emab k;
    public emag l;
    public engs m;
    public enru n;
    public int p;
    public String j = "";
    public String o = "";
    public evsx q = emptyIntList();

    static {
        elmc elmcVar = new elmc();
        b = elmcVar;
        evsn.registerDefaultInstance(elmc.class, elmcVar);
    }

    private elmc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u000e\u0000\u0001\u0001\u0014\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0003\u0004᠌\u0004\u0005ဉ\u0005\u0006ဈ\u0006\bဉ\b\nဉ\n\rဉ\r\u000eဉ\u000e\u000fဈ\u000f\u0011᠌\u0011\u0012ࠬ\u0014ဉ\u0002", new Object[]{"c", "d", ellu.a, "e", elmb.a, "g", "h", enwq.a, "i", "j", "k", "l", "m", "n", "o", "p", ellw.a, "q", enpi.a, "f"});
        }
        if (iOrdinal == 3) {
            return new elmc();
        }
        if (iOrdinal == 4) {
            return new ellv();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = r;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elmc.class) {
            evsgVar = r;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                r = evsgVar;
            }
        }
        return evsgVar;
    }
}
