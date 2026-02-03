package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbr extends evsn implements evui {
    public static final ejbr a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        ejbr ejbrVar = new ejbr();
        a = ejbrVar;
        evsn.registerDefaultInstance(ejbr.class, ejbrVar);
    }

    private ejbr() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new ejbr();
            case NEW_BUILDER:
                return new ejbq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejbr.class) {
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
