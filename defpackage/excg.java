package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class excg extends evsn implements evui {
    public static final excg a;
    private static volatile evuo c;
    public boolean b;
    private int d;

    static {
        excg excgVar = new excg();
        a = excgVar;
        evsn.registerDefaultInstance(excg.class, excgVar);
    }

    private excg() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new excg();
        }
        if (iOrdinal == 4) {
            return new excf();
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
        synchronized (excg.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
