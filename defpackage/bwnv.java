package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwnv extends evsn implements evui {
    public static final bwnv a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public aubq f;

    static {
        bwnv bwnvVar = new bwnv();
        a = bwnvVar;
        evsn.registerDefaultInstance(bwnv.class, bwnvVar);
    }

    private bwnv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new bwnv();
        }
        if (iOrdinal == 4) {
            return new bwnu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bwnv.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
