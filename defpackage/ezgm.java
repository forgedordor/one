package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezgm extends evsn implements evui {
    public static final ezgm a;
    private static volatile evuo d;
    public long b;
    public boolean c;

    static {
        ezgm ezgmVar = new ezgm();
        a = ezgmVar;
        evsn.registerDefaultInstance(ezgm.class, ezgmVar);
    }

    private ezgm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezgm();
        }
        if (iOrdinal == 4) {
            return new ezgl();
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
        synchronized (ezgm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
