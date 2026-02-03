package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exjd extends evsi implements evsj {
    public static final exjd a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        exjd exjdVar = new exjd();
        a = exjdVar;
        evsn.registerDefaultInstance(exjd.class, exjdVar);
    }

    private exjd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new exjd();
            case NEW_BUILDER:
                return new exjc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exjd.class) {
                    evsgVar = b;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        b = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
