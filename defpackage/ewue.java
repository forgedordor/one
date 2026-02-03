package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewue extends evsn implements evui {
    public static final ewue a;
    private static volatile evuo c;
    public ewtq b;
    private int d;
    private ewug e;
    private ewuc f;
    private ewtu g;
    private ewtw h;
    private ewty i;
    private ewua j;
    private byte k = 2;

    static {
        ewue ewueVar = new ewue();
        a = ewueVar;
        evsn.registerDefaultInstance(ewue.class, ewueVar);
    }

    private ewue() {
        evqs evqsVar = evqs.b;
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u000f\u0015\u0007\u0000\u0000\u0007\u000fᐉ\r\u0010ᐉ\u000e\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ᐉ\u0013", new Object[]{"d", "e", "b", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ewue();
            case NEW_BUILDER:
                return new ewud();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewue.class) {
                    evsgVar = c;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        c = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
