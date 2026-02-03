package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emms extends evsn implements evui {
    public static final emms a;
    public static final evsl b;
    private static volatile evuo e;
    public int c;
    public exvq d;
    private byte f = 2;

    static {
        emms emmsVar = new emms();
        a = emmsVar;
        evsn.registerDefaultInstance(emms.class, emmsVar);
        b = evsn.newSingularGeneratedExtension(emkw.a, emmsVar, emmsVar, null, 120, evwh.MESSAGE, emms.class);
    }

    private emms() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new emms();
            case NEW_BUILDER:
                return new emmr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emms.class) {
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
