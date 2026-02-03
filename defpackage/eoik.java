package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoik extends evsn implements evui {
    public static final eoik a;
    private static volatile evuo c;
    private byte d = 2;
    public evtg b = emptyProtobufList();

    static {
        eoik eoikVar = new eoik();
        a = eoikVar;
        evsn.registerDefaultInstance(eoik.class, eoikVar);
    }

    private eoik() {
    }

    public final void a() {
        evtg evtgVar = this.b;
        if (evtgVar.c()) {
            return;
        }
        this.b = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", eoim.class});
            case NEW_MUTABLE_INSTANCE:
                return new eoik();
            case NEW_BUILDER:
                return new eoij();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoik.class) {
                    evsgVar = c;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        c = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
