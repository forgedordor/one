package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmv extends evsi implements evsj {
    public static final emmv a;
    private static volatile evuo k;
    public int b;
    public eohx c;
    public int e;
    public int f;
    public int g;
    public emkw j;
    private byte l = 2;
    public int d = -1;
    public int h = -1;
    public evtg i = emptyProtobufList();

    static {
        emmv emmvVar = new emmv();
        a = emmvVar;
        evsn.registerDefaultInstance(emmv.class, emmvVar);
    }

    private emmv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", emmz.class, "j", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new emmv();
            case NEW_BUILDER:
                return new emmu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emmv.class) {
                    evsgVar = k;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        k = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
