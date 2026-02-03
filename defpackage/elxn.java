package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxn extends evsn implements evui {
    public static final elxn a;
    private static volatile evuo j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public evrj h;
    public evtg g = evsn.emptyProtobufList();
    public String i = "";

    static {
        elxn elxnVar = new elxn();
        a = elxnVar;
        evsn.registerDefaultInstance(elxn.class, elxnVar);
    }

    private elxn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001a\u0006ဉ\u0004\u0007ဈ\u0005", new Object[]{"b", "c", elxm.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new elxn();
        }
        if (iOrdinal == 4) {
            return new elxl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elxn.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
