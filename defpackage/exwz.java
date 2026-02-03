package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exwz extends evsn implements evui {
    public static final exwz a;
    private static volatile evuo e;
    public float d;
    private int f;
    private byte g = 2;
    public String b = "";
    public evtg c = emptyProtobufList();

    static {
        exwz exwzVar = new exwz();
        a = exwzVar;
        evsn.registerDefaultInstance(exwz.class, exwzVar);
    }

    private exwz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0002\u0002ᔈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"f", "b", "c", exwx.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new exwz();
            case NEW_BUILDER:
                return new exwy();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exwz.class) {
                    evsgVar = e;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        e = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
