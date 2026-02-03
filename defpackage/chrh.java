package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chrh extends evsn implements evui {
    public static final chrh a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        chrh chrhVar = new chrh();
        a = chrhVar;
        evsn.registerDefaultInstance(chrh.class, chrhVar);
    }

    private chrh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\f", new Object[]{"c", "b", chsh.class, chsf.class, "d"});
        }
        if (iOrdinal == 3) {
            return new chrh();
        }
        if (iOrdinal == 4) {
            return new chrg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (chrh.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
