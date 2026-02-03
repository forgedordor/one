package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewot extends evsn implements evui {
    public static final ewot a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ewot ewotVar = new ewot();
        a = ewotVar;
        evsn.registerDefaultInstance(ewot.class, ewotVar);
    }

    private ewot() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", ewmp.class, ewor.class, ewlx.class});
        }
        if (iOrdinal == 3) {
            return new ewot();
        }
        if (iOrdinal == 4) {
            return new ewos();
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
        synchronized (ewot.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
