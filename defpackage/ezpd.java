package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpd extends evsn<ezpd, ezpc> implements ezpe {
    public static final ezpd a;
    private static volatile evuo b;

    static {
        ezpd ezpdVar = new ezpd();
        a = ezpdVar;
        evsn.registerDefaultInstance(ezpd.class, ezpdVar);
    }

    private ezpd() {
        emptyProtobufList();
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
            return new ezpd();
        }
        if (iOrdinal == 4) {
            return new ezpc();
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
        synchronized (ezpd.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
