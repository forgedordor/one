package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjhi extends evsn implements evui {
    public static final evsy a = new cjhg();
    public static final cjhi b;
    private static volatile evuo j;
    public int c;
    public cjjw d;
    public cjju e;
    public cjju f;
    public cjhm g;
    public evvp h;
    public evsx i = emptyIntList();

    static {
        cjhi cjhiVar = new cjhi();
        b = cjhiVar;
        evsn.registerDefaultInstance(cjhi.class, cjhiVar);
    }

    private cjhi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\bࠬ", new Object[]{"c", "d", "e", "f", "g", "h", "i", cjha.a});
        }
        if (iOrdinal == 3) {
            return new cjhi();
        }
        if (iOrdinal == 4) {
            return new cjhh();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjhi.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
