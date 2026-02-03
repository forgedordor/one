package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chph extends evsn implements evui {
    public static final chph a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        chph chphVar = new chph();
        a = chphVar;
        evsn.registerDefaultInstance(chph.class, chphVar);
    }

    private chph() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new chph();
        }
        if (iOrdinal == 4) {
            return new chpg();
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
        synchronized (chph.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
