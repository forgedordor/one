package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqf extends evsn implements evui {
    public static final epqf a;
    private static volatile evuo c;
    public String b = "";

    static {
        epqf epqfVar = new epqf();
        a = epqfVar;
        evsn.registerDefaultInstance(epqf.class, epqfVar);
    }

    private epqf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epqf();
        }
        if (iOrdinal == 4) {
            return new epqe();
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
        synchronized (epqf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
