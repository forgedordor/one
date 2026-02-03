package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejk extends evsn implements evui {
    public static final fejk a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        fejk fejkVar = new fejk();
        a = fejkVar;
        evsn.registerDefaultInstance(fejk.class, fejkVar);
    }

    private fejk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new fejk();
        }
        if (iOrdinal == 4) {
            return new fejj();
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
        synchronized (fejk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
