package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejt extends evsn implements evui {
    public static final fejt a;
    private static volatile evuo q;
    public int b;
    public int d;
    public int e;
    public evrj f;
    public evrj g;
    public evrj h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public feeg m;
    public long n;
    public long o;
    private byte r = 2;
    public String c = "";
    public evta p = emptyLongList();

    static {
        fejt fejtVar = new fejt();
        a = fejtVar;
        evsn.registerDefaultInstance(fejt.class, fejtVar);
    }

    private fejt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0001\u0001\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bᐉ\n\fဂ\u000b\rဂ\f\u0011&", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", fejs.a, "k", "l", "m", "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new fejt();
            case NEW_BUILDER:
                return new fejr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = q;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fejt.class) {
                    evsgVar = q;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        q = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
