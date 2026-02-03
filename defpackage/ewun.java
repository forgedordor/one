package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewun extends evsn implements evui {
    public static final ewun a;
    private static volatile evuo g;
    public int b;
    public ewvl e;
    private byte h = 2;
    public evtg c = emptyProtobufList();
    public String d = "";
    public int f = 3;

    static {
        ewun ewunVar = new ewun();
        a = ewunVar;
        evsn.registerDefaultInstance(ewun.class, ewunVar);
    }

    private ewun() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", ewum.class, "d", "e", "f", ewvq.a});
            case NEW_MUTABLE_INSTANCE:
                return new ewun();
            case NEW_BUILDER:
                return new ewuk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewun.class) {
                    evsgVar = g;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        g = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
