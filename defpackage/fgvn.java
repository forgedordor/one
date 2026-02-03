package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvn extends evsn implements evui {
    public static final fgvn a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        fgvn fgvnVar = new fgvn();
        a = fgvnVar;
        evsn.registerDefaultInstance(fgvn.class, fgvnVar);
    }

    private fgvn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", fgvj.class, fgvs.class, fgvu.class});
        }
        if (iOrdinal == 3) {
            return new fgvn();
        }
        if (iOrdinal == 4) {
            return new fgvm();
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
        synchronized (fgvn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
