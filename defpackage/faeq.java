package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class faeq extends evsn implements evui {
    public static final faeq a;
    private static volatile evuo b;

    static {
        faeq faeqVar = new faeq();
        a = faeqVar;
        evsn.registerDefaultInstance(faeq.class, faeqVar);
    }

    private faeq() {
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
            return new faeq();
        }
        if (iOrdinal == 4) {
            return new faep();
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
        synchronized (faeq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
