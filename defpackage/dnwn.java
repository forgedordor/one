package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwn extends evsn implements evui {
    public static final dnwn a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public dokx g;

    static {
        dnwn dnwnVar = new dnwn();
        a = dnwnVar;
        evsn.registerDefaultInstance(dnwn.class, dnwnVar);
    }

    private dnwn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001d\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003dဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new dnwn();
        }
        if (iOrdinal == 4) {
            return new dnwm();
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
        synchronized (dnwn.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
