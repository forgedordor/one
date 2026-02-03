package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezce extends evsn implements evui {
    public static final ezce a;
    private static volatile evuo c;
    public int b;

    static {
        ezce ezceVar = new ezce();
        a = ezceVar;
        evsn.registerDefaultInstance(ezce.class, ezceVar);
    }

    private ezce() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezce();
        }
        if (iOrdinal == 4) {
            return new ezcd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezce.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
