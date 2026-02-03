package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbm extends evsn implements evui {
    public static final ewbm a;
    private static volatile evuo c;
    private byte d = 2;
    public evtg b = emptyProtobufList();

    static {
        ewbm ewbmVar = new ewbm();
        a = ewbmVar;
        evsn.registerDefaultInstance(ewbm.class, ewbmVar);
    }

    private ewbm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", ewuw.class});
            case NEW_MUTABLE_INSTANCE:
                return new ewbm();
            case NEW_BUILDER:
                return new ewbl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewbm.class) {
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
