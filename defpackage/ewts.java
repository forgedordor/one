package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewts extends evsn implements evui {
    public static final ewts a;
    private static volatile evuo b;
    private int c;
    private ewug d;
    private ewtq e;
    private byte f = 2;

    static {
        ewts ewtsVar = new ewts();
        a = ewtsVar;
        evsn.registerDefaultInstance(ewts.class, ewtsVar);
    }

    private ewts() {
        evqs evqsVar = evqs.b;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ewts();
            case NEW_BUILDER:
                return new ewtr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewts.class) {
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
