package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwu extends evsn implements evui {
    public static final etwu a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public long d;
    public int e;
    public evvp f;

    static {
        etwu etwuVar = new etwu();
        a = etwuVar;
        evsn.registerDefaultInstance(etwu.class, etwuVar);
    }

    private etwu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", etws.a, "f"});
        }
        if (iOrdinal == 3) {
            return new etwu();
        }
        if (iOrdinal == 4) {
            return new etwr();
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
        synchronized (etwu.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
