package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewum extends evsn implements evui {
    public static final ewum a;
    private static volatile evuo h;
    public int b;
    public int c;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public evtg f = emptyProtobufList();
    public evtg g = emptyProtobufList();

    static {
        ewum ewumVar = new ewum();
        a = ewumVar;
        evsn.registerDefaultInstance(ewum.class, ewumVar);
    }

    private ewum() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л\u0005Л", new Object[]{"b", "c", ewus.a, "d", "e", "f", ewuw.class, "g", ewuw.class});
            case NEW_MUTABLE_INSTANCE:
                return new ewum();
            case NEW_BUILDER:
                return new ewul();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewum.class) {
                    evsgVar = h;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        h = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
