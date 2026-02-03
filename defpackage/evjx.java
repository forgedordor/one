package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjx extends evsn implements evui {
    public static final evjx a;
    private static volatile evuo e;
    public Object c;
    private int f;
    public int b = 0;
    public String d = "";

    static {
        evjx evjxVar = new evjx();
        a = evjxVar;
        evsn.registerDefaultInstance(evjx.class, evjxVar);
    }

    private evjx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဈ\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000\u0006:\u0000", new Object[]{"c", "b", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new evjx();
        }
        if (iOrdinal == 4) {
            return new evjw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evjx.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
