package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojn extends evsn implements evui {
    public static final eojn a;
    private static volatile evuo g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        eojn eojnVar = new eojn();
        a = eojnVar;
        evsn.registerDefaultInstance(eojn.class, eojnVar);
    }

    private eojn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0001", new Object[]{"b", "c", eokp.a, "e", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new eojn();
        }
        if (iOrdinal == 4) {
            return new eojm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eojn.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
