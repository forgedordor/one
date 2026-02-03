package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqj extends evsn implements evui {
    public static final epqj a;
    private static volatile evuo c;
    public boolean b;

    static {
        epqj epqjVar = new epqj();
        a = epqjVar;
        evsn.registerDefaultInstance(epqj.class, epqjVar);
    }

    private epqj() {
        emptyProtobufList();
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epqj();
        }
        if (iOrdinal == 4) {
            return new epqi();
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
        synchronized (epqj.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
