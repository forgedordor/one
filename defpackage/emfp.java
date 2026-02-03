package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class emfp extends evsn implements evui {
    public static final emfp a;
    private static volatile evuo k;
    public int b;
    public int c;
    public evsx d = emptyIntList();
    public evsx e = emptyIntList();
    public evsx f = emptyIntList();
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        emfp emfpVar = new emfp();
        a = emfpVar;
        evsn.registerDefaultInstance(emfp.class, emfpVar);
    }

    private emfp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emfk.a;
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0000\u0001᠌\u0000\u0003ࠞ\u0004ࠞ\u0005ࠞ\u0006᠌\u0001\u0007᠌\u0002\b᠌\u0003\t᠌\u0004", new Object[]{"b", "c", emfh.a, "d", evsvVar, "e", evsvVar, "f", evsvVar, "g", emfn.a, "h", emfj.a, "i", emfm.a, "j", emfi.a});
        }
        if (iOrdinal == 3) {
            return new emfp();
        }
        if (iOrdinal == 4) {
            return new emfg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emfp.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
