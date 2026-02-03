package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auhv extends evsn implements evui {
    public static final auhv a;
    private static volatile evuo b;

    static {
        auhv auhvVar = new auhv();
        a = auhvVar;
        evsn.registerDefaultInstance(auhv.class, auhvVar);
    }

    private auhv() {
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
            return new auhv();
        }
        if (iOrdinal == 4) {
            return new auhu();
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
        synchronized (auhv.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
