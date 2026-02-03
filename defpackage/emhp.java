package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhp extends evsn implements evui {
    public static final emhp a;
    private static volatile evuo g;
    public int b;
    public long c;
    public elho d;
    public String e = "";
    public int f;

    static {
        emhp emhpVar = new emhp();
        a = emhpVar;
        evsn.registerDefaultInstance(emhp.class, emhpVar);
    }

    private emhp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new emhp();
        }
        if (iOrdinal == 4) {
            return new emho();
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
        synchronized (emhp.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
