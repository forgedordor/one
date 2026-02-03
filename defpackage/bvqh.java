package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqh extends evsn implements evui {
    public static final bvqh a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        bvqh bvqhVar = new bvqh();
        a = bvqhVar;
        evsn.registerDefaultInstance(bvqh.class, bvqhVar);
    }

    private bvqh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bvqh();
        }
        if (iOrdinal == 4) {
            return new bvqg();
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
        synchronized (bvqh.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
