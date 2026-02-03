package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exhs extends evsn implements evui {
    public static final exhs a;
    private static volatile evuo e;
    public String b = "";
    public evtg c = evsn.emptyProtobufList();
    public boolean d;

    static {
        exhs exhsVar = new exhs();
        a = exhsVar;
        evsn.registerDefaultInstance(exhs.class, exhsVar);
    }

    private exhs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exhs();
        }
        if (iOrdinal == 4) {
            return new exhr();
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
        synchronized (exhs.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
