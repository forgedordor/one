package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezet extends evsn implements evui {
    public static final ezet a;
    private static volatile evuo g;
    public int b;
    public eybg d;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        ezet ezetVar = new ezet();
        a = ezetVar;
        evsn.registerDefaultInstance(ezet.class, ezetVar);
    }

    private ezet() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezet();
        }
        if (iOrdinal == 4) {
            return new ezes();
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
        synchronized (ezet.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
