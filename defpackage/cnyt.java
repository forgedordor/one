package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnyt extends evsn implements evui {
    public static final cnyt a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evvp d;
    public evvp e;
    public evvp f;

    static {
        cnyt cnytVar = new cnyt();
        a = cnytVar;
        evsn.registerDefaultInstance(cnyt.class, cnytVar);
    }

    private cnyt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cnyt();
        }
        if (iOrdinal == 4) {
            return new cnys();
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
        synchronized (cnyt.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
