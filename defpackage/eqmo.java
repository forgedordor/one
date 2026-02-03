package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqmo extends evsn implements evui {
    public static final eqmo a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        eqmo eqmoVar = new eqmo();
        a = eqmoVar;
        evsn.registerDefaultInstance(eqmo.class, eqmoVar);
    }

    private eqmo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0001\u0000\u0001\u000f\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bȈ\t<\u0000\f<\u0000\u000f<\u0000", new Object[]{"c", "b", eqng.class, eqjy.class, eqka.class, eqno.class, eqnj.class, evrl.class, eqkq.class, "d", eqjj.class, eqoc.class, eqjo.class});
        }
        if (iOrdinal == 3) {
            return new eqmo();
        }
        if (iOrdinal == 4) {
            return new eqmm();
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
        synchronized (eqmo.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
