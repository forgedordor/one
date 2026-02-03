package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctef extends evsn implements evui {
    public static final ctef a;
    private static volatile evuo b;

    static {
        ctef ctefVar = new ctef();
        a = ctefVar;
        evsn.registerDefaultInstance(ctef.class, ctefVar);
    }

    private ctef() {
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
            return new ctef();
        }
        if (iOrdinal == 4) {
            return new ctee();
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
        synchronized (ctef.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
