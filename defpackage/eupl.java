package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupl extends evsn implements evui {
    public static final eupl a;
    private static volatile evuo e;
    public Object c;
    private int f;
    public int b = 0;
    private byte g = 2;
    public String d = "";

    static {
        eupl euplVar = new eupl();
        a = euplVar;
        evsn.registerDefaultInstance(eupl.class, euplVar);
    }

    private eupl() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ለ\u0000\u0002м\u0000\u0003<\u0000", new Object[]{"c", "b", "f", "d", eupi.class, eupk.class});
            case NEW_MUTABLE_INSTANCE:
                return new eupl();
            case NEW_BUILDER:
                return new eupg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eupl.class) {
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
