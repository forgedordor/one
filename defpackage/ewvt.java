package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewvt extends evsi implements evsj {
    public static final ewvt a;
    private static volatile evuo h;
    public int b;
    public int c;
    private byte i = 2;
    public String d = "";
    public evtg e = emptyProtobufList();
    public evtg f = emptyProtobufList();
    public String g = "";

    static {
        ewvt ewvtVar = new ewvt();
        a = ewvtVar;
        evsn.registerDefaultInstance(ewvt.class, ewvtVar);
    }

    private ewvt() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0002\u0001᠌\u0000\u0004ဈ\u0002\u0005Л\u0006Л\bဈ\u0005", new Object[]{"b", "c", ewus.a, "d", "e", ewuw.class, "f", ewuw.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ewvt();
            case NEW_BUILDER:
                return new ewvs();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewvt.class) {
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
