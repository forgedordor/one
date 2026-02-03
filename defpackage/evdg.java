package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdg extends evsn implements evui {
    public static final evdg a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        evdg evdgVar = new evdg();
        a = evdgVar;
        evsn.registerDefaultInstance(evdg.class, evdgVar);
    }

    private evdg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = evdf.a;
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", evde.a, "e", evsvVar, "f", evsvVar});
        }
        if (iOrdinal == 3) {
            return new evdg();
        }
        if (iOrdinal == 4) {
            return new evdd();
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
        synchronized (evdg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
