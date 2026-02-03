package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezhk extends evsn implements evui {
    public static final ezhk a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        ezhk ezhkVar = new ezhk();
        a = ezhkVar;
        evsn.registerDefaultInstance(ezhk.class, ezhkVar);
    }

    private ezhk() {
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
                return newMessageInfo(a, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new ezhk();
            case NEW_BUILDER:
                return new ezhj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ezhk.class) {
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
