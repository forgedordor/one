package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephd extends evsn implements evui {
    public static final ephd a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ephd ephdVar = new ephd();
        a = ephdVar;
        evsn.registerDefaultInstance(ephd.class, ephdVar);
    }

    private ephd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ephd();
        }
        if (iOrdinal == 4) {
            return new ephc();
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
        synchronized (ephd.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
