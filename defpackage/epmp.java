package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epmp extends evsn implements evui {
    public static final epmp a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        epmp epmpVar = new epmp();
        a = epmpVar;
        evsn.registerDefaultInstance(epmp.class, epmpVar);
    }

    private epmp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\f\u0003\u0000\u0000\u0000\u0001Ȉ\u000b<\u0000\f<\u0000", new Object[]{"c", "b", "d", epms.class, epmy.class});
        }
        if (iOrdinal == 3) {
            return new epmp();
        }
        if (iOrdinal == 4) {
            return new epmn();
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
        synchronized (epmp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
