package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezvo extends evsn implements evui {
    public static final ezvo a;
    private static volatile evuo b;

    static {
        ezvo ezvoVar = new ezvo();
        a = ezvoVar;
        evsn.registerDefaultInstance(ezvo.class, ezvoVar);
    }

    private ezvo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ezvo();
        }
        if (iOrdinal == 4) {
            return new ezvn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezvo.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
