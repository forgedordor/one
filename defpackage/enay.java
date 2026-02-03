package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enay extends evsn implements evui {
    public static final enay a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public enat f;
    public int g;
    public int h;
    public int i;

    static {
        enay enayVar = new enay();
        a = enayVar;
        evsn.registerDefaultInstance(enay.class, enayVar);
    }

    private enay() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", enav.a, "e", enau.a, "f", "g", epvc.a, "h", enbb.a, "i", enax.a});
        }
        if (iOrdinal == 3) {
            return new enay();
        }
        if (iOrdinal == 4) {
            return new enar();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enay.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
