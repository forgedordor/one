package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezic extends evsn implements evui {
    public static final ezic a;
    private static volatile evuo c;
    public ezpb b;
    private int d;

    static {
        ezic ezicVar = new ezic();
        a = ezicVar;
        evsn.registerDefaultInstance(ezic.class, ezicVar);
    }

    private ezic() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ezic();
        }
        if (iOrdinal == 4) {
            return new ezib();
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
        synchronized (ezic.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
