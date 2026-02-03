package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplj extends evsn implements evui {
    public static final eplj a;
    private static volatile evuo f;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";

    static {
        eplj epljVar = new eplj();
        a = epljVar;
        evsn.registerDefaultInstance(eplj.class, epljVar);
    }

    private eplj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", "e", eplr.class, epkm.class, eplb.class});
        }
        if (iOrdinal == 3) {
            return new eplj();
        }
        if (iOrdinal == 4) {
            return new epli();
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
        synchronized (eplj.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
