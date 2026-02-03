package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvx extends evsn implements evui {
    public static final efvx a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        efvx efvxVar = new efvx();
        a = efvxVar;
        evsn.registerDefaultInstance(efvx.class, efvxVar);
    }

    private efvx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new efvx();
        }
        if (iOrdinal == 4) {
            return new efvw();
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
        synchronized (efvx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
