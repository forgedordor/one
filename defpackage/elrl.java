package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elrl extends evsn implements evui {
    public static final elrl a;
    private static volatile evuo i;
    public int b;
    public elrn c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        elrl elrlVar = new elrl();
        a = elrlVar;
        evsn.registerDefaultInstance(elrl.class, elrlVar);
    }

    private elrl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", elri.a, "e", elrj.a, "f", elrf.a, "g", elrg.a, "h", elrh.a});
        }
        if (iOrdinal == 3) {
            return new elrl();
        }
        if (iOrdinal == 4) {
            return new elre();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elrl.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
