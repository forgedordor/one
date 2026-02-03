package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxn extends evsn implements evui {
    public static final dzxn a;
    private static volatile evuo l;
    public int b;
    public fedk c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public feeg j;
    public int k;
    private byte m = 2;
    public String i = "";

    static {
        dzxn dzxnVar = new dzxn();
        a = dzxnVar;
        evsn.registerDefaultInstance(dzxn.class, dzxnVar);
    }

    private dzxn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new dzxn();
            case NEW_BUILDER:
                return new dzxm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dzxn.class) {
                    evsgVar = l;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        l = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
