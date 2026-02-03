package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbi extends evsn implements evui {
    public static final epbi a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        epbi epbiVar = new epbi();
        a = epbiVar;
        evsn.registerDefaultInstance(epbi.class, epbiVar);
    }

    private epbi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", epcq.class, epbe.class, epel.class, epbh.class});
        }
        if (iOrdinal == 3) {
            return new epbi();
        }
        if (iOrdinal == 4) {
            return new epbf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epbi.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
