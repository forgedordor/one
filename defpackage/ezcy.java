package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezcy extends evsn implements evui {
    public static final evsy a = new ezcw();
    public static final ezcy b;
    private static volatile evuo p;
    public int c;
    public ezpp d;
    public int e;
    public ezdx f;
    public int h;
    public long l;
    public ejqq n;
    public ezgm o;
    private byte q = 2;
    public String g = "";
    public String i = "";
    public String j = "";
    public evsx k = emptyIntList();
    public String m = "";

    static {
        ezcy ezcyVar = new ezcy();
        b = ezcyVar;
        evsn.registerDefaultInstance(ezcy.class, ezcyVar);
    }

    private ezcy() {
    }

    public final void a() {
        evsx evsxVar = this.k;
        if (evsxVar.c()) {
            return;
        }
        this.k = evsn.mutableCopy(evsxVar);
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
                return newMessageInfo(b, "\u0000\f\u0000\u0001\u0001\u000f\f\u0000\u0001\u0001\u0001ဉ\u0000\u0002\f\u0003ᐉ\u0001\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007Ȉ\b,\f\u0002\rȈ\u000eဉ\u0004\u000fဉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new ezcy();
            case NEW_BUILDER:
                return new ezcx();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                evuo evuoVar = p;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ezcy.class) {
                    evsgVar = p;
                    if (evsgVar == null) {
                        evsgVar = new evsg(b);
                        p = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
