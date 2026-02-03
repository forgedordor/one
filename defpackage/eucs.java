package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eucs extends evsn implements evui {
    public static final eucs a;
    private static volatile evuo g;
    public int b;
    public evtg c = evsn.emptyProtobufList();
    public eudf d;
    public eucg e;
    public euce f;

    static {
        eucs eucsVar = new eucs();
        a = eucsVar;
        evsn.registerDefaultInstance(eucs.class, eucsVar);
    }

    private eucs() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\f\u0004\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0001\u0007ဉ\u0004\fဉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eucs();
        }
        if (iOrdinal == 4) {
            return new eucr();
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
        synchronized (eucs.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
