package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eioc extends evsn implements evui {
    public static final eioc a;
    private static volatile evuo b;
    private int c;
    private eiok d;
    private eiof e;
    private byte f = 2;

    static {
        eioc eiocVar = new eioc();
        a = eiocVar;
        evsn.registerDefaultInstance(eioc.class, eiocVar);
    }

    private eioc() {
        evsn.emptyProtobufList();
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u000f\u0002\u0000\u0000\u0001\u0006ᐉ\u0007\u000fဉ\u0010", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new eioc();
            case NEW_BUILDER:
                return new eiob();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eioc.class) {
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
