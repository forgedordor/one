package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugc extends evsn implements evui {
    public static final eugc a;
    private static volatile evuo n;
    public int b;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public eizu l;
    public evtg c = emptyProtobufList();
    public evqs k = evqs.b;
    public String m = "";

    static {
        eugc eugcVar = new eugc();
        a = eugcVar;
        evsn.registerDefaultInstance(eugc.class, eugcVar);
    }

    private eugc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\nည\u0007\u000bဉ\b\rဈ\n", new Object[]{"b", "c", eugb.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new eugc();
        }
        if (iOrdinal == 4) {
            return new eufz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eugc.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
