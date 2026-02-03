package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvtq extends evsn implements evui {
    public static final bvtq a;
    private static volatile evuo f;
    public int b;
    public int c;
    public ezol d;
    public String e = "";

    static {
        bvtq bvtqVar = new bvtq();
        a = bvtqVar;
        evsn.registerDefaultInstance(bvtq.class, bvtqVar);
    }

    private bvtq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bvtq();
        }
        if (iOrdinal == 4) {
            return new bvtp();
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
        synchronized (bvtq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
