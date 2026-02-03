package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewwx extends evsn implements evui {
    public static final ewwx a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        ewwx ewwxVar = new ewwx();
        a = ewwxVar;
        evsn.registerDefaultInstance(ewwx.class, ewwxVar);
    }

    private ewwx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new ewwx();
            case NEW_BUILDER:
                return new ewww();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewwx.class) {
                    evsgVar = b;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        b = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
