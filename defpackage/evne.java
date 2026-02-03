package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evne extends evsn implements evui {
    public static final evsy a = new evnc();
    public static final evne b;
    private static volatile evuo d;
    public evsx c = emptyIntList();

    static {
        evne evneVar = new evne();
        b = evneVar;
        evsn.registerDefaultInstance(evne.class, evneVar);
    }

    private evne() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", evnp.a});
        }
        if (iOrdinal == 3) {
            return new evne();
        }
        if (iOrdinal == 4) {
            return new evnd();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evne.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
