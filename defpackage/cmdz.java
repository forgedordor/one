package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdz extends evsn implements evui {
    public static final cmdz a;
    private static volatile evuo e;
    public int b;
    public long c;
    public evvp d;

    static {
        cmdz cmdzVar = new cmdz();
        a = cmdzVar;
        evsn.registerDefaultInstance(cmdz.class, cmdzVar);
    }

    private cmdz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ဂ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cmdz();
        }
        if (iOrdinal == 4) {
            return new cmdy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cmdz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
