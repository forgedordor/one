package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppt extends evsn implements evui {
    public static final eppt a;
    private static volatile evuo i;
    public epnw b;
    public long c;
    public String d = "";
    public String e = "";
    public evqs f = evqs.b;
    public String g = "";
    public epqj h;
    private int j;

    static {
        eppt epptVar = new eppt();
        a = epptVar;
        evsn.registerDefaultInstance(eppt.class, epptVar);
    }

    private eppt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005\n\u0006Ȉ\u0007ဉ\u0001", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eppt();
        }
        if (iOrdinal == 4) {
            return new epps();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eppt.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
