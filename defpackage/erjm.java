package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erjm extends evsn implements evui {
    public static final erjm a;
    private static volatile evuo f;
    public int b;
    public int c;
    public erjo d;
    public int e;

    static {
        erjm erjmVar = new erjm();
        a = erjmVar;
        evsn.registerDefaultInstance(erjm.class, erjmVar);
    }

    private erjm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new erjm();
        }
        if (iOrdinal == 4) {
            return new erjl();
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
        synchronized (erjm.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
