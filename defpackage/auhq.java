package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auhq extends evsn implements evui {
    public static final auhq a;
    private static volatile evuo b;

    static {
        auhq auhqVar = new auhq();
        a = auhqVar;
        evsn.registerDefaultInstance(auhq.class, auhqVar);
    }

    private auhq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new auhq();
        }
        if (iOrdinal == 4) {
            return new auhp();
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
        synchronized (auhq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
