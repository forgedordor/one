package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqo extends evsn implements evui {
    public static final etqo a;
    private static volatile evuo c;
    public long b;

    static {
        etqo etqoVar = new etqo();
        a = etqoVar;
        evsn.registerDefaultInstance(etqo.class, etqoVar);
    }

    private etqo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new etqo();
        }
        if (iOrdinal == 4) {
            return new etqn();
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
        synchronized (etqo.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
