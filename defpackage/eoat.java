package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoat extends evsn implements evui {
    public static final eoat a;
    private static volatile evuo g;
    public int b;
    public int c;
    public eoaw d;
    public ensj e;
    public eoba f;

    static {
        eoat eoatVar = new eoat();
        a = eoatVar;
        evsn.registerDefaultInstance(eoat.class, eoatVar);
    }

    private eoat() {
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
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001ဌ\u0000\bဉ\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eoat();
        }
        if (iOrdinal == 4) {
            return new eoas();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoat.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
