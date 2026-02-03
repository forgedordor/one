package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefo extends evsn implements evui {
    public static final fefo a;
    private static volatile evuo g;
    public int b;
    public long c;
    public int d;
    public fefy f;
    private byte h = 2;
    public evtg e = emptyProtobufList();

    static {
        fefo fefoVar = new fefo();
        a = fefoVar;
        evsn.registerDefaultInstance(fefo.class, fefoVar);
    }

    private fefo() {
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
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", fefr.class, "d", fefn.a, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new fefo();
            case NEW_BUILDER:
                return new fefm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = g;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fefo.class) {
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
