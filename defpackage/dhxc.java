package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhxc extends evsn implements evui {
    public static final dhxc a;
    private static volatile evuo j;
    public int b;
    public evqs c;
    public evqs d;
    public long e;
    public evqs f;
    public boolean g;
    public String h;
    public boolean i;

    static {
        dhxc dhxcVar = new dhxc();
        a = dhxcVar;
        evsn.registerDefaultInstance(dhxc.class, dhxcVar);
    }

    private dhxc() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = evqsVar;
        this.f = evqsVar;
        this.h = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0004\u000e\u0007\u0000\u0000\u0000\u0004ည\u0000\u0006ဂ\u0002\u0007ည\u0001\u000bည\u0003\fဇ\u0004\rဈ\u0005\u000eဇ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dhxc();
        }
        if (iOrdinal == 4) {
            return new dhxb();
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
        synchronized (dhxc.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
