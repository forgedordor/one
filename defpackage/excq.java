package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class excq extends evsn implements evui {
    public static final excq a;
    private static volatile evuo c;
    public excg b;
    private int d;

    static {
        excq excqVar = new excq();
        a = excqVar;
        evsn.registerDefaultInstance(excq.class, excqVar);
    }

    private excq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new excq();
        }
        if (iOrdinal == 4) {
            return new excp();
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
        synchronized (excq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
