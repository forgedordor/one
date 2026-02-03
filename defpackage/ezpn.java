package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpn extends evsn implements evui {
    public static final ezpn a;
    private static volatile evuo h;
    public int b;
    public evqs c = evqs.b;
    public evsx d = emptyIntList();
    public evtg e = emptyProtobufList();
    public ezpb f;
    public long g;

    static {
        ezpn ezpnVar = new ezpn();
        a = ezpnVar;
        evsn.registerDefaultInstance(ezpn.class, ezpnVar);
    }

    private ezpn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\n\u0002'\u0003ဉ\u0000\u0006\u001b\u0007\u0003", new Object[]{"b", "c", "d", "f", "e", eznv.class, "g"});
        }
        if (iOrdinal == 3) {
            return new ezpn();
        }
        if (iOrdinal == 4) {
            return new ezpm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezpn.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
