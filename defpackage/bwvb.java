package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvb extends evsn implements evui {
    public static final evsy a = new bwux();
    public static final bwvb b;
    private static volatile evuo f;
    public int c;
    public aubq d;
    public evsx e = emptyIntList();

    static {
        bwvb bwvbVar = new bwvb();
        b = bwvbVar;
        evsn.registerDefaultInstance(bwvb.class, bwvbVar);
    }

    private bwvb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002ࠬ", new Object[]{"c", "d", "e", bwuz.a});
        }
        if (iOrdinal == 3) {
            return new bwvb();
        }
        if (iOrdinal == 4) {
            return new bwuy();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bwvb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
