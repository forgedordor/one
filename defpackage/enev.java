package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enev extends evsn implements evui {
    public static final enev a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;

    static {
        enev enevVar = new enev();
        a = enevVar;
        evsn.registerDefaultInstance(enev.class, enevVar);
    }

    private enev() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"b", "c", eneu.a, "d", enes.a, "e", "f", ener.a});
        }
        if (iOrdinal == 3) {
            return new enev();
        }
        if (iOrdinal == 4) {
            return new enet();
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
        synchronized (enev.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
