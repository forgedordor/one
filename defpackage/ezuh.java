package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezuh extends evsn implements evui {
    public static final ezuh a;
    private static volatile evuo d;
    public String b = "";
    public evqs c = evqs.b;

    static {
        ezuh ezuhVar = new ezuh();
        a = ezuhVar;
        evsn.registerDefaultInstance(ezuh.class, ezuhVar);
    }

    private ezuh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezuh();
        }
        if (iOrdinal == 4) {
            return new ezug();
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
        synchronized (ezuh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
