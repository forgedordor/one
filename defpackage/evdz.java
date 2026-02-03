package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdz extends evsn implements evui {
    public static final evdz a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public evdy f;
    public int c = 0;
    public String e = "";

    static {
        evdz evdzVar = new evdz();
        a = evdzVar;
        evsn.registerDefaultInstance(evdz.class, evdzVar);
    }

    private evdz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u0003ဉ\u0001\u0004;\u0000", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new evdz();
        }
        if (iOrdinal == 4) {
            return new evdt();
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
        synchronized (evdz.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
