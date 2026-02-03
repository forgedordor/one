package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdj extends evsn implements evui {
    public static final emdj a;
    private static volatile evuo g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        emdj emdjVar = new emdj();
        a = emdjVar;
        evsn.registerDefaultInstance(emdj.class, emdjVar);
    }

    private emdj() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", emdi.a, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new emdj();
        }
        if (iOrdinal == 4) {
            return new emdh();
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
        synchronized (emdj.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
