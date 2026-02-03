package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmme extends evsn implements evui {
    public static final cmme a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public cmmb d;

    static {
        cmme cmmeVar = new cmme();
        a = cmmeVar;
        evsn.registerDefaultInstance(cmme.class, cmmeVar);
    }

    private cmme() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", cmmh.class, "d"});
        }
        if (iOrdinal == 3) {
            return new cmme();
        }
        if (iOrdinal == 4) {
            return new cmmd();
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
        synchronized (cmme.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
