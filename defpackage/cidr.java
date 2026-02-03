package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cidr extends evsn implements evui {
    public static final cidr a;
    private static volatile evuo c;
    public String b = "";

    static {
        cidr cidrVar = new cidr();
        a = cidrVar;
        evsn.registerDefaultInstance(cidr.class, cidrVar);
    }

    private cidr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new cidr();
        }
        if (iOrdinal == 4) {
            return new cidq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cidr.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
