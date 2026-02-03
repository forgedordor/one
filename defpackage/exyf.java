package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exyf extends evsn implements evui {
    public static final exyf a;
    private static volatile evuo b;
    private evub c = evub.a;

    static {
        exyf exyfVar = new exyf();
        a = exyfVar;
        evsn.registerDefaultInstance(exyf.class, exyfVar);
    }

    private exyf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", exye.a});
        }
        if (iOrdinal == 3) {
            return new exyf();
        }
        if (iOrdinal == 4) {
            return new exyd();
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
        synchronized (exyf.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
