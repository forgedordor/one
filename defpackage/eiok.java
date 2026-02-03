package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiok extends evsn implements evui {
    public static final eiok a;
    private static volatile evuo b;
    private int c;
    private eioh d;
    private evub e = evub.a;
    private byte f = 2;

    static {
        eiok eiokVar = new eiok();
        a = eiokVar;
        evsn.registerDefaultInstance(eiok.class, eiokVar);
    }

    private eiok() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\b\u0016\u0002\u0001\u0000\u0001\bᐉ\b\u00162", new Object[]{"c", "d", "e", eioi.a});
            case NEW_MUTABLE_INSTANCE:
                return new eiok();
            case NEW_BUILDER:
                return new eioj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eiok.class) {
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
