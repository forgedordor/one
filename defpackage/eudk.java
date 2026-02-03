package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudk extends evsn implements evui {
    public static final eudk a;
    private static volatile evuo b;
    private byte c = 2;

    static {
        eudk eudkVar = new eudk();
        a = eudkVar;
        evsn.registerDefaultInstance(eudk.class, eudkVar);
    }

    private eudk() {
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
                return new eudk();
            case NEW_BUILDER:
                return new eudj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eudk.class) {
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
