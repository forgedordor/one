package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwc extends evsn implements evui {
    public static final enwc a;
    private static volatile evuo f;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        enwc enwcVar = new enwc();
        a = enwcVar;
        evsn.registerDefaultInstance(enwc.class, enwcVar);
    }

    private enwc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", enwb.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new enwc();
        }
        if (iOrdinal == 4) {
            return new enwa();
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
        synchronized (enwc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
