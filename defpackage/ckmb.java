package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmb extends evsn implements evui {
    public static final ckmb a;
    private static volatile evuo f;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";

    static {
        ckmb ckmbVar = new ckmb();
        a = ckmbVar;
        evsn.registerDefaultInstance(ckmb.class, ckmbVar);
    }

    private ckmb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001e\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\fe<\u0000", new Object[]{"c", "b", "d", "e", dnwn.class});
        }
        if (iOrdinal == 3) {
            return new ckmb();
        }
        if (iOrdinal == 4) {
            return new ckma();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ckmb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
