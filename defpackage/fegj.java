package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegj extends evsn implements evui {
    public static final fegj a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        fegj fegjVar = new fegj();
        a = fegjVar;
        evsn.registerDefaultInstance(fegj.class, fegjVar);
    }

    private fegj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00014\u0000\u00024\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new fegj();
        }
        if (iOrdinal == 4) {
            return new fegi();
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
        synchronized (fegj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
