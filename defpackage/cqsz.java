package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqsz extends evsn implements evui {
    public static final cqsz a;
    private static volatile evuo f;
    public int b;
    public int c = 1600;
    public int d = 80;
    public boolean e = true;

    static {
        cqsz cqszVar = new cqsz();
        a = cqszVar;
        evsn.registerDefaultInstance(cqsz.class, cqszVar);
    }

    private cqsz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cqsz();
        }
        if (iOrdinal == 4) {
            return new cqsy();
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
        synchronized (cqsz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
