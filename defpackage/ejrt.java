package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrt extends evsn implements evui {
    public static final ejrt a;
    private static volatile evuo e;
    public int b;
    public ejrv c;
    private byte f = 2;
    public evtg d = emptyProtobufList();

    static {
        ejrt ejrtVar = new ejrt();
        a = ejrtVar;
        evsn.registerDefaultInstance(ejrt.class, ejrtVar);
    }

    private ejrt() {
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", ejqy.class});
            case NEW_MUTABLE_INSTANCE:
                return new ejrt();
            case NEW_BUILDER:
                return new ejrs();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejrt.class) {
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
