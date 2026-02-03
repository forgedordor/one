package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezuf extends evsn implements evui {
    public static final ezuf a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        ezuf ezufVar = new ezuf();
        a = ezufVar;
        evsn.registerDefaultInstance(ezuf.class, ezufVar);
    }

    private ezuf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezuf();
        }
        if (iOrdinal == 4) {
            return new ezue();
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
        synchronized (ezuf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
