package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyuo extends evsn implements evui {
    public static final eyuo a;
    private static volatile evuo h;
    public int b;
    public eyva d;
    public boolean g;
    public String c = "";
    public evtg e = emptyProtobufList();
    public evtg f = emptyProtobufList();

    static {
        eyuo eyuoVar = new eyuo();
        a = eyuoVar;
        evsn.registerDefaultInstance(eyuo.class, eyuoVar);
    }

    private eyuo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004\u001b\u0005\u0007", new Object[]{"b", "c", "d", "e", eyuy.class, "f", eyuq.class, "g"});
        }
        if (iOrdinal == 3) {
            return new eyuo();
        }
        if (iOrdinal == 4) {
            return new eyun();
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
        synchronized (eyuo.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
