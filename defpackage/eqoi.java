package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoi extends evsn implements evui {
    public static final eqoi a;
    private static volatile evuo f;
    public int b;
    public eqny c;
    public eqko d;
    public evrw e;
    private evzg g;
    private byte h = 2;

    static {
        eqoi eqoiVar = new eqoi();
        a = eqoiVar;
        evsn.registerDefaultInstance(eqoi.class, eqoiVar);
    }

    private eqoi() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဉ\u0003ϧဉ\u0000", new Object[]{"b", "d", "g", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new eqoi();
            case NEW_BUILDER:
                return new eqoh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eqoi.class) {
                    evsgVar = f;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        f = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
