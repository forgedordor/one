package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euro extends evsn implements evui {
    public static final euro a;
    private static volatile evuo f;
    public int b;
    public int c;
    public long d;
    public eurc e;

    static {
        euro euroVar = new euro();
        a = euroVar;
        evsn.registerDefaultInstance(euro.class, euroVar);
    }

    private euro() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", exwd.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new euro();
        }
        if (iOrdinal == 4) {
            return new eurn();
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
        synchronized (euro.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
