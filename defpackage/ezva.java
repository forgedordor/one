package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezva extends evsn implements evui {
    public static final ezva a;
    private static volatile evuo c;
    public int b;

    static {
        ezva ezvaVar = new ezva();
        a = ezvaVar;
        evsn.registerDefaultInstance(ezva.class, ezvaVar);
    }

    private ezva() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezva();
        }
        if (iOrdinal == 4) {
            return new ezuz();
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
        synchronized (ezva.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
