package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauo extends evsn implements evui {
    public static final cauo a;
    private static volatile evuo p;
    public int b;
    public int i;
    public boolean k;
    public int l;
    public int m;
    public long o;
    private byte q = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String n = "";

    static {
        cauo cauoVar = new cauo();
        a = cauoVar;
        evsn.registerDefaultInstance(cauo.class, cauoVar);
    }

    private cauo() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\n\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006ᔈ\u0005\u0007ᔄ\u0006\bဈ\u0007\tᔇ\b\nᔄ\t\u000bᔄ\n\fဈ\u000b\rဂ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new cauo();
            case NEW_BUILDER:
                return new caun();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = p;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (cauo.class) {
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
