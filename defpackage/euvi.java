package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvi extends evsn implements evui {
    public static final euvi a;
    private static volatile evuo c;
    private Object d;
    public int b = 0;
    private byte e = 2;

    static {
        euvi euviVar = new euvi();
        a = euviVar;
        evsn.registerDefaultInstance(euvi.class, euviVar);
    }

    private euvi() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0007\u0001м\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000\u0005м\u0000\u0006м\u0000\u0007м\u0000", new Object[]{"d", "b", euvf.class, euvk.class, euvs.class, euvo.class, euvu.class, euvm.class, euvq.class});
            case NEW_MUTABLE_INSTANCE:
                return new euvi();
            case NEW_BUILDER:
                return new euvg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (euvi.class) {
                    evsgVar = c;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        c = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
