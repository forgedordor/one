package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutu extends evsn implements evui {
    public static final eutu a;
    private static volatile evuo g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        eutu eutuVar = new eutu();
        a = eutuVar;
        evsn.registerDefaultInstance(eutu.class, eutuVar);
    }

    private eutu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eutu();
        }
        if (iOrdinal == 4) {
            return new eutt();
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
        synchronized (eutu.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
