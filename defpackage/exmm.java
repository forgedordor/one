package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmm extends evsn implements evui {
    public static final exmm a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public evtg e = emptyProtobufList();
    public exjh f;
    public long g;

    static {
        exmm exmmVar = new exmm();
        a = exmmVar;
        evsn.registerDefaultInstance(exmm.class, exmmVar);
    }

    private exmm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u001b\u0004ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", "e", exjh.class, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exmm();
        }
        if (iOrdinal == 4) {
            return new exml();
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
        synchronized (exmm.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
