package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtoq extends evsn implements evui {
    public static final dtoq a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        dtoq dtoqVar = new dtoq();
        a = dtoqVar;
        evsn.registerDefaultInstance(dtoq.class, dtoqVar);
    }

    private dtoq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dtoo.class});
        }
        if (iOrdinal == 3) {
            return new dtoq();
        }
        if (iOrdinal == 4) {
            return new dtop();
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
        synchronized (dtoq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
