package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiar extends evsn implements evui {
    public static final aiar a;
    private static volatile evuo b;

    static {
        aiar aiarVar = new aiar();
        a = aiarVar;
        evsn.registerDefaultInstance(aiar.class, aiarVar);
    }

    private aiar() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aiar();
        }
        if (iOrdinal == 4) {
            return new aiaq();
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
        synchronized (aiar.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
