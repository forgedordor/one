package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyl extends evsn implements evui {
    public static final euyl a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public long d;

    static {
        euyl euylVar = new euyl();
        a = euylVar;
        evsn.registerDefaultInstance(euyl.class, euylVar);
    }

    private euyl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"b", "c", euyn.class, "d"});
        }
        if (iOrdinal == 3) {
            return new euyl();
        }
        if (iOrdinal == 4) {
            return new euyk();
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
        synchronized (euyl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
