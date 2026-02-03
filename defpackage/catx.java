package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class catx extends evsn implements evui {
    public static final catx a;
    private static volatile evuo g;
    public String b = "";
    public long c;
    public boolean d;
    public int e;
    public int f;

    static {
        catx catxVar = new catx();
        a = catxVar;
        evsn.registerDefaultInstance(catx.class, catxVar);
    }

    private catx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0007\u0004\u0004\u0005\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new catx();
        }
        if (iOrdinal == 4) {
            return new catw();
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
        synchronized (catx.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
