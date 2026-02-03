package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejg extends evsn implements evui {
    public static final fejg a;
    private static volatile evuo e;
    public int b;
    public evrj d;
    private boolean f;
    private byte g = 2;
    public evtg c = emptyProtobufList();

    static {
        fejg fejgVar = new fejg();
        a = fejgVar;
        evsn.registerDefaultInstance(fejg.class, fejgVar);
    }

    private fejg() {
    }

    public static /* synthetic */ void a(fejg fejgVar) {
        fejgVar.b |= 2;
        fejgVar.f = true;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", fejf.class, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new fejg();
            case NEW_BUILDER:
                return new fejd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = e;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fejg.class) {
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
