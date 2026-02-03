package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augc extends evsn implements evui {
    public static final augc a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        augc augcVar = new augc();
        a = augcVar;
        evsn.registerDefaultInstance(augc.class, augcVar);
    }

    private augc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", auco.a});
        }
        if (iOrdinal == 3) {
            return new augc();
        }
        if (iOrdinal == 4) {
            return new augb();
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
        synchronized (augc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
