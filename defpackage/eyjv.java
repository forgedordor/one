package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyjv extends evsn implements evui {
    public static final eyjv a;
    private static volatile evuo f;
    public boolean b;
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        eyjv eyjvVar = new eyjv();
        a = eyjvVar;
        evsn.registerDefaultInstance(eyjv.class, eyjvVar);
    }

    private eyjv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eyjv();
        }
        if (iOrdinal == 4) {
            return new eyju();
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
        synchronized (eyjv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
