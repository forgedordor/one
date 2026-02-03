package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjv extends evsn implements evui {
    public static final ezjv a;
    private static volatile evuo d;
    public ezpr b;
    public evtg c;
    private int e;

    static {
        ezjv ezjvVar = new ezjv();
        a = ezjvVar;
        evsn.registerDefaultInstance(ezjv.class, ezjvVar);
    }

    private ezjv() {
        emptyProtobufList();
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b", new Object[]{"e", "b", "c", ezqd.class});
        }
        if (iOrdinal == 3) {
            return new ezjv();
        }
        if (iOrdinal == 4) {
            return new ezju();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezjv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
