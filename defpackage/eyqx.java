package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyqx extends evsn implements evui {
    public static final eyqx a;
    private static volatile evuo c;
    public String b = "";

    static {
        eyqx eyqxVar = new eyqx();
        a = eyqxVar;
        evsn.registerDefaultInstance(eyqx.class, eyqxVar);
    }

    private eyqx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eyqx();
        }
        if (iOrdinal == 4) {
            return new eyqw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyqx.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
