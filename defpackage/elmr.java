package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmr extends evsn implements evui {
    public static final elmr a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        elmr elmrVar = new elmr();
        a = elmrVar;
        evsn.registerDefaultInstance(elmr.class, elmrVar);
    }

    private elmr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = elhr.a;
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"b", "c", elmq.a, "d", evsvVar, "e", evsvVar, "f", evsvVar, "g", evsvVar, "h", elmo.a});
        }
        if (iOrdinal == 3) {
            return new elmr();
        }
        if (iOrdinal == 4) {
            return new elmn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elmr.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
