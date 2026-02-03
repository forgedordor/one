package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkj extends evsn implements evui {
    public static final ejkj a;
    private static volatile evuo l;
    public int b;
    public ejhz c;
    public ejir d;
    public ejha e;
    public ejkf g;
    public ejkl h;
    public boolean i;
    public boolean j;
    public ejkd k;
    private byte m = 2;
    public evtg f = emptyProtobufList();

    static {
        ejkj ejkjVar = new ejkj();
        a = ejkjVar;
        evsn.registerDefaultInstance(ejkj.class, ejkjVar);
    }

    private ejkj() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0003\u000f\t\u0000\u0001\u0001\u0003ဉ\u0000\bဉ\u0002\tᐉ\u0001\nဉ\u0003\u000b\u001b\fဉ\u0004\rဇ\u0005\u000eဉ\u0007\u000fဇ\u0006", new Object[]{"b", "c", "e", "d", "g", "f", ejha.class, "h", "i", "k", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ejkj();
            case NEW_BUILDER:
                return new ejki();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejkj.class) {
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
