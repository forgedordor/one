package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cinf extends evsn implements evui {
    public static final cinf a;
    private static volatile evuo e;
    public long b;
    public long c;
    public String d = "";

    static {
        cinf cinfVar = new cinf();
        a = cinfVar;
        evsn.registerDefaultInstance(cinf.class, cinfVar);
    }

    private cinf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cinf();
        }
        if (iOrdinal == 4) {
            return new cine();
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
        synchronized (cinf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
