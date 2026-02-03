package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnng extends evsn implements evui {
    public static final dnng a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        dnng dnngVar = new dnng();
        a = dnngVar;
        evsn.registerDefaultInstance(dnng.class, dnngVar);
    }

    private dnng() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dnng();
        }
        if (iOrdinal == 4) {
            return new dnnf();
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
        synchronized (dnng.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
