package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryn extends evsi implements evsj {
    public static final dryn a;
    private static volatile evuo c;
    public int b;
    private int d;
    private byte e = 2;

    static {
        dryn drynVar = new dryn();
        a = drynVar;
        evsn.registerDefaultInstance(dryn.class, drynVar);
    }

    private dryn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"d", "b", dryl.a});
            case NEW_MUTABLE_INSTANCE:
                return new dryn();
            case NEW_BUILDER:
                return new dryk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dryn.class) {
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
