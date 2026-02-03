package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sda extends evsn implements evui {
    public static final sda a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        sda sdaVar = new sda();
        a = sdaVar;
        evsn.registerDefaultInstance(sda.class, sdaVar);
    }

    private sda() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", scy.class});
        }
        if (iOrdinal == 3) {
            return new sda();
        }
        if (iOrdinal == 4) {
            return new scz();
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
        synchronized (sda.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
