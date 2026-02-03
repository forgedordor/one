package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltw extends evsn implements evui {
    public static final dltw a;
    private static volatile evuo d;
    public int b;
    public dltt c;

    static {
        dltw dltwVar = new dltw();
        a = dltwVar;
        evsn.registerDefaultInstance(dltw.class, dltwVar);
    }

    private dltw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001dd\u0001\u0000\u0000\u0000dဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dltw();
        }
        if (iOrdinal == 4) {
            return new dltv();
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
        synchronized (dltw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
