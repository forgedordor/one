package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eysj extends evsn implements evui {
    public static final eysj a;
    private static volatile evuo f;
    public boolean c;
    public boolean d;
    public evqs b = evqs.b;
    public evsx e = emptyIntList();

    static {
        eysj eysjVar = new eysj();
        a = eysjVar;
        evsn.registerDefaultInstance(eysj.class, eysjVar);
    }

    private eysj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0007\u0003\u0007\u0004,", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eysj();
        }
        if (iOrdinal == 4) {
            return new eysi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eysj.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
