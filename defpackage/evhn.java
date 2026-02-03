package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhn extends evsn implements evui {
    public static final evhn a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        evhn evhnVar = new evhn();
        a = evhnVar;
        evsn.registerDefaultInstance(evhn.class, evhnVar);
    }

    private evhn() {
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
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0004ဈ\u0000", new Object[]{"d", "c", "b", evhj.class, evfk.a, "e"});
        }
        if (iOrdinal == 3) {
            return new evhn();
        }
        if (iOrdinal == 4) {
            return new evhm();
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
        synchronized (evhn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
