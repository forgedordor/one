package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvkv extends evsn implements evui {
    public static final bvkv a;
    private static volatile evuo d;
    public evqs b = evqs.b;
    public String c = "";

    static {
        bvkv bvkvVar = new bvkv();
        a = bvkvVar;
        evsn.registerDefaultInstance(bvkv.class, bvkvVar);
    }

    private bvkv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bvkv();
        }
        if (iOrdinal == 4) {
            return new bvku();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bvkv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
