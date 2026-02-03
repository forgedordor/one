package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enlh extends evsn implements evui {
    public static final enlh a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        enlh enlhVar = new enlh();
        a = enlhVar;
        evsn.registerDefaultInstance(enlh.class, enlhVar);
    }

    private enlh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", enlg.a, "d", "e", enlb.a, "f", enlc.a, "g", enld.a});
        }
        if (iOrdinal == 3) {
            return new enlh();
        }
        if (iOrdinal == 4) {
            return new enlf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enlh.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
