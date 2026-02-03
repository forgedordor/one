package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjty extends evsn implements evui {
    public static final cjty a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public evvp f;

    static {
        cjty cjtyVar = new cjty();
        a = cjtyVar;
        evsn.registerDefaultInstance(cjty.class, cjtyVar);
    }

    private cjty() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cjty();
        }
        if (iOrdinal == 4) {
            return new cjtx();
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
        synchronized (cjty.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
