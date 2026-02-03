package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoin extends evsn implements evui {
    public static final eoin a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public eoih e;
    public int c = 0;
    private byte h = 2;
    public evtg f = emptyProtobufList();

    static {
        eoin eoinVar = new eoin();
        a = eoinVar;
        evsn.registerDefaultInstance(eoin.class, eoinVar);
    }

    private eoin() {
    }

    public final void a() {
        evtg evtgVar = this.f;
        if (evtgVar.c()) {
            return;
        }
        this.f = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", eoih.class, eoik.class});
            case NEW_MUTABLE_INSTANCE:
                return new eoin();
            case NEW_BUILDER:
                return new eoii();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoin.class) {
                    evsgVar = g;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        g = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
