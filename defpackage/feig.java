package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feig extends evsi implements evsj {
    public static final feig a;
    private static volatile evuo p;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public feio j;
    public int l;
    public int m;
    public int n;
    public feio o;
    private byte q = 2;
    public evtg k = emptyProtobufList();

    static {
        feig feigVar = new feig();
        a = feigVar;
        evsn.registerDefaultInstance(feig.class, feigVar);
    }

    private feig() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "k", feie.class, "l", "e", "g", "h", "j", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new feig();
            case NEW_BUILDER:
                return new feif();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = p;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feig.class) {
                    evsgVar = p;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        p = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
