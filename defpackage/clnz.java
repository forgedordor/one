package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clnz extends evsn implements evui {
    public static final clnz a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        clnz clnzVar = new clnz();
        a = clnzVar;
        evsn.registerDefaultInstance(clnz.class, clnzVar);
    }

    private clnz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new clnz();
        }
        if (iOrdinal == 4) {
            return new clnx();
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
        synchronized (clnz.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
