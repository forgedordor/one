package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ella extends evsn implements evui {
    public static final ella a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        ella ellaVar = new ella();
        a = ellaVar;
        evsn.registerDefaultInstance(ella.class, ellaVar);
    }

    private ella() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0005င\u0004", new Object[]{"b", "c", elkx.a, "d"});
        }
        if (iOrdinal == 3) {
            return new ella();
        }
        if (iOrdinal == 4) {
            return new elkz();
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
        synchronized (ella.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
