package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athj extends evsn implements evui {
    public static final athj a;
    private static volatile evuo l;
    public int b;
    public aubx d;
    public long e;
    public boolean f;
    public aubq g;
    public boolean h;
    public long j;
    public boolean k;
    public String c = "";
    public String i = "";

    static {
        athj athjVar = new athj();
        a = athjVar;
        evsn.registerDefaultInstance(athj.class, athjVar);
    }

    private athj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\u0001\nဇ\b", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "d", "k"});
        }
        if (iOrdinal == 3) {
            return new athj();
        }
        if (iOrdinal == 4) {
            return new athi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (athj.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
