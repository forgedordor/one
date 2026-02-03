package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabk extends evsn implements evui {
    public static final eabk a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        eabk eabkVar = new eabk();
        a = eabkVar;
        evsn.registerDefaultInstance(eabk.class, eabkVar);
    }

    private eabk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", eabi.a});
        }
        if (iOrdinal == 3) {
            return new eabk();
        }
        if (iOrdinal == 4) {
            return new eabj();
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
        synchronized (eabk.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
