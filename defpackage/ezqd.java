package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqd extends evsn implements evui {
    public static final ezqd a;
    private static volatile evuo d;
    public ezol b;
    public evtg c;
    private int e;

    static {
        ezqd ezqdVar = new ezqd();
        a = ezqdVar;
        evsn.registerDefaultInstance(ezqd.class, ezqdVar);
    }

    private ezqd() {
        emptyIntList();
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0005\u001b", new Object[]{"e", "b", "c", ezpn.class});
        }
        if (iOrdinal == 3) {
            return new ezqd();
        }
        if (iOrdinal == 4) {
            return new ezqc();
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
        synchronized (ezqd.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
