package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqd extends evsn implements evui {
    public static final epqd a;
    private static volatile evuo f;
    public int b;
    public epqf d;
    public String c = "";
    public String e = "";

    static {
        epqd epqdVar = new epqd();
        a = epqdVar;
        evsn.registerDefaultInstance(epqd.class, epqdVar);
    }

    private epqd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epqd();
        }
        if (iOrdinal == 4) {
            return new epqc();
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
        synchronized (epqd.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
