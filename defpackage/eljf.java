package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eljf extends evsn implements evui {
    public static final eljf a;
    private static volatile evuo b;

    static {
        eljf eljfVar = new eljf();
        a = eljfVar;
        evsn.registerDefaultInstance(eljf.class, eljfVar);
    }

    private eljf() {
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
            return new eljf();
        }
        if (iOrdinal == 4) {
            return new elje();
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
        synchronized (eljf.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
