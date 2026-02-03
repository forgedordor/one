package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feck extends evsn implements evui {
    public static final feck a;
    private static volatile evuo p;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public fecf l;
    public feeg m;
    public fejc n;
    public fejk o;
    private byte q = 2;
    public String c = "";

    static {
        feck feckVar = new feck();
        a = feckVar;
        evsn.registerDefaultInstance(feck.class, feckVar);
    }

    private feck() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f", new Object[]{"b", "c", "d", feci.a, "e", "f", fech.a, "g", "i", "j", "k", "l", "h", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new feck();
            case NEW_BUILDER:
                return new fecg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = p;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (feck.class) {
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
