package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcf extends evsn implements evui {
    public static final dqcf a;
    private static volatile evuo c;
    public evsx b = emptyIntList();

    static {
        dqcf dqcfVar = new dqcf();
        a = dqcfVar;
        evsn.registerDefaultInstance(dqcf.class, dqcfVar);
    }

    private dqcf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dqcf();
        }
        if (iOrdinal == 4) {
            return new dqce();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dqcf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
