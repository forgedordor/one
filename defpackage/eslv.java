package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslv extends evsn implements evui {
    public static final eslv a;
    private static volatile evuo e;
    public int b;
    public int c = 1;
    public int d;

    static {
        eslv eslvVar = new eslv();
        a = eslvVar;
        evsn.registerDefaultInstance(eslv.class, eslvVar);
    }

    private eslv() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0007\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0007င\u0002", new Object[]{"b", "c", eslw.a, "d"});
        }
        if (iOrdinal == 3) {
            return new eslv();
        }
        if (iOrdinal == 4) {
            return new eslu();
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
        synchronized (eslv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
