package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaar extends evsn implements evui {
    public static final aaar a;
    private static volatile evuo f;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        aaar aaarVar = new aaar();
        a = aaarVar;
        evsn.registerDefaultInstance(aaar.class, aaarVar);
    }

    private aaar() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aaar();
        }
        if (iOrdinal == 4) {
            return new aaap();
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
        synchronized (aaar.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
