package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csup extends evsn implements evui {
    public static final csup a;
    private static volatile evuo j;
    public int b;
    public evub c;
    public evub d;
    public evub e;
    public boolean f;
    public evvp g;
    public csuf h;
    public long i;

    static {
        csup csupVar = new csup();
        a = csupVar;
        evsn.registerDefaultInstance(csup.class, csupVar);
    }

    private csup() {
        evub evubVar = evub.a;
        this.c = evubVar;
        this.d = evubVar;
        this.e = evubVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\n\u0007\u0003\u0000\u0000\u00012\u00022\u00032\u0007\u0007\bဉ\u0000\tဉ\u0001\n\u0002", new Object[]{"b", "c", csun.a, "d", csum.a, "e", csuo.a, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new csup();
        }
        if (iOrdinal == 4) {
            return new csul();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (csup.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
