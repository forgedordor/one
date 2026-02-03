package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqg extends evsn implements evui {
    public static final euqg a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        euqg euqgVar = new euqg();
        a = euqgVar;
        evsn.registerDefaultInstance(euqg.class, euqgVar);
    }

    private euqg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new euqg();
        }
        if (iOrdinal == 4) {
            return new euqf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (euqg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
