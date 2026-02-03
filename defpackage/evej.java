package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evej extends evsn implements evui {
    public static final evej a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        evej evejVar = new evej();
        a = evejVar;
        evsn.registerDefaultInstance(evej.class, evejVar);
    }

    private evej() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0004ဈ\u0000", new Object[]{"d", "c", "b", eveg.class, evbr.a, "e"});
        }
        if (iOrdinal == 3) {
            return new evej();
        }
        if (iOrdinal == 4) {
            return new evei();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evej.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
