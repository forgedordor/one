package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emek extends evsn implements evui {
    public static final emek a;
    private static volatile evuo r;
    public int b;
    public emcx c;
    public emca d;
    public emdj e;
    public emcp f;
    public emej g;
    public emee h;
    public emdo i;
    public boolean l;
    public emdu m;
    public emdc n;
    public emdz o;
    public long p;
    public emcz q;
    private byte s = 2;
    public String j = "";
    public String k = "";

    static {
        emek emekVar = new emek();
        a = emekVar;
        evsn.registerDefaultInstance(emek.class, emekVar);
    }

    private emek() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0007\u0003ᐉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဈ\b\bဉ\u0005\tဉ\u0006\nဇ\t\fဉ\u000b\rဉ\f\u0010ဉ\u000f\u0013ဂ\u0012\u0014ဉ\u0013", new Object[]{"b", "c", "j", "d", "e", "f", "g", "k", "h", "i", "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new emek();
            case NEW_BUILDER:
                return new emce();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = r;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emek.class) {
                    evsgVar = r;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        r = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
