package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzps extends evsn implements evui {
    public static final dzps a;
    private static volatile evuo d;
    public int b;
    public String c = "";
    private int e;

    static {
        dzps dzpsVar = new dzps();
        a = dzpsVar;
        evsn.registerDefaultInstance(dzps.class, dzpsVar);
    }

    private dzps() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"e", "b", dzpt.a, "c"});
        }
        if (iOrdinal == 3) {
            return new dzps();
        }
        if (iOrdinal == 4) {
            return new dzpr();
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
        synchronized (dzps.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
