package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emkt extends evsn implements evui {
    public static final emkt a;
    public static final evsl b;
    private static volatile evuo d;
    private Object e;
    public int c = 0;
    private byte f = 2;

    static {
        emkt emktVar = new emkt();
        a = emktVar;
        evsn.registerDefaultInstance(emkt.class, emktVar);
        b = evsn.newSingularGeneratedExtension(emmz.a, emktVar, emktVar, null, 772, evwh.MESSAGE, emkt.class);
    }

    private emkt() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"e", "c", eohz.class, eohx.class});
            case NEW_MUTABLE_INSTANCE:
                return new emkt();
            case NEW_BUILDER:
                return new emks();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emkt.class) {
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
