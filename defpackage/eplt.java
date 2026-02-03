package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplt extends evsn implements evui {
    public static final eplt a;
    private static volatile evuo c;
    public String b;

    static {
        eplt epltVar = new eplt();
        a = epltVar;
        evsn.registerDefaultInstance(eplt.class, epltVar);
    }

    private eplt() {
        emptyProtobufList();
        this.b = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eplt();
        }
        if (iOrdinal == 4) {
            return new epls();
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
        synchronized (eplt.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
