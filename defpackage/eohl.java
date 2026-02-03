package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohl extends evsn implements evui {
    public static final eohl a;
    private static volatile evuo k;
    public int b;
    public int c;
    public eogy f;
    public eogq g;
    public eoho h;
    public eohr i;
    public eogy j;
    private eoht l;
    private eoha m;
    private eogo n;
    private byte o = 2;
    public String d = "";
    public String e = "";

    static {
        eohl eohlVar = new eohl();
        a = eohlVar;
        evsn.registerDefaultInstance(eohl.class, eohlVar);
    }

    private eohl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"b", "c", eohk.a, "d", "e", "l", "m", "n", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new eohl();
            case NEW_BUILDER:
                return new eohj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eohl.class) {
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
