package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoid extends evsn implements evui {
    public static final eoid a;
    private static volatile evuo l;
    public int b;
    public eoib c;
    public int e;
    public int h;
    public eoin k;
    private byte m = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        eoid eoidVar = new eoid();
        a = eoidVar;
        evsn.registerDefaultInstance(eoid.class, eoidVar);
    }

    private eoid() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new eoid();
            case NEW_BUILDER:
                return new eoic();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoid.class) {
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
