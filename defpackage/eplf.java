package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplf extends evsn implements evui {
    public static final eplf a;
    private static volatile evuo y;
    public int b;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public epkp m;
    public epkw n;
    public epln o;
    public eplp s;
    public eplt t;
    public boolean u;
    private byte z = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public evtg p = emptyProtobufList();
    public evtg q = emptyProtobufList();
    public evtg r = emptyProtobufList();
    public String v = "";
    public String w = "";
    public String x = "";

    static {
        eplf eplfVar = new eplf();
        a = eplfVar;
        evsn.registerDefaultInstance(eplf.class, eplfVar);
    }

    private eplf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.z);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0003\u0001\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007\f\b\f\t\f\nဉ\u0000\u000bဉ\u0001\fဉ\u0002\r\u001b\u000eЛ\u000f\u001b\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0007\u0013ለ\u0005\u0014\u0002\u0015ለ\u0006\u0016Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", eplj.class, "q", epld.class, "r", epkr.class, "s", "t", "u", "v", "i", "w", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new eplf();
            case NEW_BUILDER:
                return new eple();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = y;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eplf.class) {
                    evsgVar = y;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        y = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
