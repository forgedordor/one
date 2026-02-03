package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzx extends evsn implements evui {
    public static final exzx a;
    private static volatile evuo c;
    public int b;

    static {
        exzx exzxVar = new exzx();
        a = exzxVar;
        evsn.registerDefaultInstance(exzx.class, exzxVar);
    }

    private exzx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new exzx();
        }
        if (iOrdinal == 4) {
            return new exzw();
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
        synchronized (exzx.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
