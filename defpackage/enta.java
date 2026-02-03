package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enta extends evsn implements evui {
    public static final enta a;
    private static volatile evuo s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public boolean n;
    public int o;
    public boolean p;
    public evsx i = emptyIntList();
    public evsx j = emptyIntList();
    public evsx k = emptyIntList();
    public evsr l = emptyBooleanList();
    public evsr m = emptyBooleanList();
    public evsx q = emptyIntList();
    public evsx r = emptyIntList();

    static {
        enta entaVar = new enta();
        a = entaVar;
        evsn.registerDefaultInstance(enta.class, entaVar);
    }

    private enta() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = entn.a;
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0007\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007'\b'\t*\n*\u000bဇ\u0006\f᠌\u0007\rဇ\b\u000eࠬ\u000f'\u0010ࠬ", new Object[]{"b", "c", "d", "e", "f", "g", "h", evsvVar, "i", "k", "l", "m", "n", "o", ensz.a, "p", "q", ensu.a, "r", "j", evsvVar});
        }
        if (iOrdinal == 3) {
            return new enta();
        }
        if (iOrdinal == 4) {
            return new ensy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enta.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
