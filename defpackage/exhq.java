package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exhq extends evsn implements evui {
    public static final exhq a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        exhq exhqVar = new exhq();
        a = exhqVar;
        evsn.registerDefaultInstance(exhq.class, exhqVar);
    }

    private exhq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", exho.class});
        }
        if (iOrdinal == 3) {
            return new exhq();
        }
        if (iOrdinal == 4) {
            return new exhp();
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
        synchronized (exhq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
