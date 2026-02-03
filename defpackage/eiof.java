package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiof extends evsn implements evui {
    public static final eiof a;
    private static volatile evuo b;
    private evub c = evub.a;

    static {
        eiof eiofVar = new eiof();
        a = eiofVar;
        evsn.registerDefaultInstance(eiof.class, eiofVar);
    }

    private eiof() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", eioe.a});
        }
        if (iOrdinal == 3) {
            return new eiof();
        }
        if (iOrdinal == 4) {
            return new eiod();
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
        synchronized (eiof.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
