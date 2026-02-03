package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elvv extends evsn implements evui {
    public static final elvv a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        elvv elvvVar = new elvv();
        a = elvvVar;
        evsn.registerDefaultInstance(elvv.class, elvvVar);
    }

    private elvv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", elvu.a, "e"});
        }
        if (iOrdinal == 3) {
            return new elvv();
        }
        if (iOrdinal == 4) {
            return new elvt();
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
        synchronized (elvv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
