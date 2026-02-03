package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emil extends evsn implements evui {
    public static final emil a;
    private static volatile evuo f;
    public int b;
    public int c;
    public emih d;
    public evtg e = emptyProtobufList();

    static {
        emil emilVar = new emil();
        a = emilVar;
        evsn.registerDefaultInstance(emil.class, emilVar);
    }

    private emil() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", emir.class});
        }
        if (iOrdinal == 3) {
            return new emil();
        }
        if (iOrdinal == 4) {
            return new emik();
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
        synchronized (emil.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
