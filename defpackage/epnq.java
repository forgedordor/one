package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnq extends evsn implements evui {
    public static final epnq a;
    private static volatile evuo h;
    public int c;
    public boolean f;
    public int g;
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        epnq epnqVar = new epnq();
        a = epnqVar;
        evsn.registerDefaultInstance(epnq.class, epnqVar);
    }

    private epnq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new epnq();
        }
        if (iOrdinal == 4) {
            return new epno();
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
        synchronized (epnq.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
