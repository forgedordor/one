package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzl extends evsn implements evui {
    public static final etzl a;
    private static volatile evuo b;

    static {
        etzl etzlVar = new etzl();
        a = etzlVar;
        evsn.registerDefaultInstance(etzl.class, etzlVar);
    }

    private etzl() {
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
            return new etzl();
        }
        if (iOrdinal == 4) {
            return new etzk();
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
        synchronized (etzl.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
