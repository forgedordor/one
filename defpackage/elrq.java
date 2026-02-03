package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elrq extends evsn implements evui {
    public static final elrq a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public int f;

    static {
        elrq elrqVar = new elrq();
        a = elrqVar;
        evsn.registerDefaultInstance(elrq.class, elrqVar);
    }

    private elrq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", elrp.a});
        }
        if (iOrdinal == 3) {
            return new elrq();
        }
        if (iOrdinal == 4) {
            return new elro();
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
        synchronized (elrq.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
