package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejc extends evsn implements evui {
    public static final fejc a;
    private static volatile evuo f;
    public int b;
    public evvp d;
    public int e;
    private byte g = 2;
    public evtg c = emptyProtobufList();

    static {
        fejc fejcVar = new fejc();
        a = fejcVar;
        evsn.registerDefaultInstance(fejc.class, fejcVar);
    }

    private fejc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", feji.class, "d", "e", fejb.a});
            case NEW_MUTABLE_INSTANCE:
                return new fejc();
            case NEW_BUILDER:
                return new feja();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fejc.class) {
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
