package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epim extends evsn implements evui {
    public static final epim a;
    private static volatile evuo e;
    public int b;
    public ezdx c;
    public int d;
    private byte f = 2;

    static {
        epim epimVar = new epim();
        a = epimVar;
        evsn.registerDefaultInstance(epim.class, epimVar);
    }

    private epim() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002\f", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new epim();
            case NEW_BUILDER:
                return new epil();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (epim.class) {
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
