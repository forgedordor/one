package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebba extends evsn implements evui {
    public static final ebba a;
    private static volatile evuo e;
    public int b;
    public ejrv c;
    public evtg d = emptyProtobufList();

    static {
        ebba ebbaVar = new ebba();
        a = ebbaVar;
        evsn.registerDefaultInstance(ebba.class, ebbaVar);
    }

    private ebba() {
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", ebay.class});
        }
        if (iOrdinal == 3) {
            return new ebba();
        }
        if (iOrdinal == 4) {
            return new ebaz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ebba.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
