package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgs extends evsn implements evui {
    public static final dzgs a;
    private static volatile evuo f;
    public int b;
    public long c;
    public evvp d;
    private byte g = 2;
    public evtg e = emptyProtobufList();

    static {
        dzgs dzgsVar = new dzgs();
        a = dzgsVar;
        evsn.registerDefaultInstance(dzgs.class, dzgsVar);
    }

    private dzgs() {
    }

    public final void a() {
        evtg evtgVar = this.e;
        if (evtgVar.c()) {
            return;
        }
        this.e = evsn.mutableCopy(evtgVar);
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", dzgj.class});
            case NEW_MUTABLE_INSTANCE:
                return new dzgs();
            case NEW_BUILDER:
                return new dzgh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dzgs.class) {
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
