package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etom extends evsn implements evui {
    public static final etom a;
    private static volatile evuo j;
    public int b;
    public etmv c;
    public int d;
    public boolean e;
    public evtg f = emptyProtobufList();
    public boolean g;
    public evtg h;
    public int i;

    static {
        etom etomVar = new etom();
        a = etomVar;
        evsn.registerDefaultInstance(etom.class, etomVar);
    }

    private etom() {
        emptyProtobufList();
        this.h = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001b\u0005ဇ\u0005\u0006\u001b\u0007᠌\u0006\tဇ\u0002", new Object[]{"b", "c", "d", "f", etmi.class, "g", "h", etoc.class, "i", etoj.a, "e"});
        }
        if (iOrdinal == 3) {
            return new etom();
        }
        if (iOrdinal == 4) {
            return new etol();
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
        synchronized (etom.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
