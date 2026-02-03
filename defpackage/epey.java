package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epey extends evsn implements evui {
    public static final epey a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public epcm d;
    public boolean e;
    public epqd f;

    static {
        epey epeyVar = new epey();
        a = epeyVar;
        evsn.registerDefaultInstance(epey.class, epeyVar);
    }

    private epey() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new epey();
        }
        if (iOrdinal == 4) {
            return new epex();
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
        synchronized (epey.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
