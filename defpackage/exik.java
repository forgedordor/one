package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exik extends evsn implements evui {
    public static final evsy a = new exii();
    public static final exik b;
    private static volatile evuo g;
    public String c = "";
    public String d = "";
    public evsx e = emptyIntList();
    public String f = "";
    private int h;

    static {
        exik exikVar = new exik();
        b = exikVar;
        evsn.registerDefaultInstance(exik.class, exikVar);
    }

    private exik() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ࠞ\u0004ဈ\u0003", new Object[]{"h", "c", "d", "e", exig.a, "f"});
        }
        if (iOrdinal == 3) {
            return new exik();
        }
        if (iOrdinal == 4) {
            return new exij();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exik.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
