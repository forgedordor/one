package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjua extends evsn implements evui {
    public static final cjua a;
    private static volatile evuo g;
    public int b;
    public boolean c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        cjua cjuaVar = new cjua();
        a = cjuaVar;
        evsn.registerDefaultInstance(cjua.class, cjuaVar);
    }

    private cjua() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cjua();
        }
        if (iOrdinal == 4) {
            return new cjtz();
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
        synchronized (cjua.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
