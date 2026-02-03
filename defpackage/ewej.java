package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewej extends evsn implements evui {
    public static final ewej a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ewej ewejVar = new ewej();
        a = ewejVar;
        evsn.registerDefaultInstance(ewej.class, ewejVar);
    }

    private ewej() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u083f\u0000", new Object[]{"c", "b", ewei.a});
        }
        if (iOrdinal == 3) {
            return new ewej();
        }
        if (iOrdinal == 4) {
            return new eweh();
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
        synchronized (ewej.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
