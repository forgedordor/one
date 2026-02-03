package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqv extends evsn implements evui {
    public static final ezqv a;
    private static volatile evuo c;
    public ezot b;
    private int d;

    static {
        ezqv ezqvVar = new ezqv();
        a = ezqvVar;
        evsn.registerDefaultInstance(ezqv.class, ezqvVar);
    }

    private ezqv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ezqv();
        }
        if (iOrdinal == 4) {
            return new ezqu();
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
        synchronized (ezqv.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
