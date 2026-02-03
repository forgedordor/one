package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzp extends evsn implements evui {
    public static final anzp a;
    private static volatile evuo f;
    public int b;
    public long d;
    public String c = "";
    public String e = "";

    static {
        anzp anzpVar = new anzp();
        a = anzpVar;
        evsn.registerDefaultInstance(anzp.class, anzpVar);
    }

    private anzp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ለ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new anzp();
        }
        if (iOrdinal == 4) {
            return new anzo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (anzp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
