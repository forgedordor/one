package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennn extends evsn implements evui {
    public static final ennn a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        ennn ennnVar = new ennn();
        a = ennnVar;
        evsn.registerDefaultInstance(ennn.class, ennnVar);
    }

    private ennn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", ennm.a});
        }
        if (iOrdinal == 3) {
            return new ennn();
        }
        if (iOrdinal == 4) {
            return new ennl();
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
        synchronized (ennn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
