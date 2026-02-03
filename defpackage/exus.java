package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exus extends evsn implements evui {
    public static final exus a;
    private static volatile evuo g;
    public int b;
    public int c;
    public evqs d = evqs.b;
    public evtg e = emptyProtobufList();
    public String f = "";

    static {
        exus exusVar = new exus();
        a = exusVar;
        evsn.registerDefaultInstance(exus.class, exusVar);
    }

    private exus() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ည\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e", exur.class, "f"});
        }
        if (iOrdinal == 3) {
            return new exus();
        }
        if (iOrdinal == 4) {
            return new exup();
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
        synchronized (exus.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
