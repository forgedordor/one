package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elta extends evsn implements evui {
    public static final elta a;
    private static volatile evuo d;
    public int b;
    public elkw c;

    static {
        elta eltaVar = new elta();
        a = eltaVar;
        evsn.registerDefaultInstance(elta.class, eltaVar);
    }

    private elta() {
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
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new elta();
        }
        if (iOrdinal == 4) {
            return new elsz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elta.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
