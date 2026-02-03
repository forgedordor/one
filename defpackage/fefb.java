package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefb extends evsn implements evui {
    public static final fefb a;
    private static volatile evuo d;
    private byte e = 2;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        fefb fefbVar = new fefb();
        a = fefbVar;
        evsn.registerDefaultInstance(fefb.class, fefbVar);
    }

    private fefb() {
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
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", feez.class, "c", fefk.class});
            case NEW_MUTABLE_INSTANCE:
                return new fefb();
            case NEW_BUILDER:
                return new fefa();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fefb.class) {
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
