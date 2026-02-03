package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etzm extends evsn implements evui {
    public static final etzm a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public int d;
    public evvp e;
    public evvp f;
    public etzp g;
    public etzf h;
    public etzl i;

    static {
        etzm etzmVar = new etzm();
        a = etzmVar;
        evsn.registerDefaultInstance(etzm.class, etzmVar);
    }

    private etzm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001᠌\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0007ဈ\u0000\bဉ\u0007", new Object[]{"b", "d", etzi.a, "e", "f", "g", "h", "c", "i"});
        }
        if (iOrdinal == 3) {
            return new etzm();
        }
        if (iOrdinal == 4) {
            return new etzh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etzm.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
