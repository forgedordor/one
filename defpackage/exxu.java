package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exxu extends evsi implements evsj {
    public static final exxu a;
    private static volatile evuo d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        exxu exxuVar = new exxu();
        a = exxuVar;
        evsn.registerDefaultInstance(exxu.class, exxuVar);
    }

    private exxu() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0004м\u0000", new Object[]{"c", "b", exxh.class, exxo.class, exxs.class});
            case NEW_MUTABLE_INSTANCE:
                return new exxu();
            case NEW_BUILDER:
                return new exxt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exxu.class) {
                    evsgVar = d;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        d = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
