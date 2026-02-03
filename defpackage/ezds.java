package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezds extends evsn implements ezdt {
    public static final ezds a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public int e;
    public int g;
    public int h;
    public int i;
    public int c = 0;
    private byte k = 2;
    public String f = "";

    static {
        ezds ezdsVar = new ezds();
        a = ezdsVar;
        evsn.registerDefaultInstance(ezds.class, ezdsVar);
    }

    private ezds() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0017\u0001\u0001\u0001\u0017\u0017\u0000\u0000\u0002\u0001\f\u0002<\u0000\u0003\u0004\u0004\u0004\u0005м\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\nм\u0000\u000b<\u0000\fȈ\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014ဌ\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000", new Object[]{"d", "c", "b", "e", ezei.class, "h", "i", ejbr.class, ezbq.class, ezbd.class, ezdk.class, ezhg.class, ezbf.class, ezec.class, "f", ezgb.class, ezcl.class, ezhc.class, ezee.class, ezhi.class, ezcp.class, ezep.class, "g", ezde.class, ezdo.class, ezdq.class});
            case NEW_MUTABLE_INSTANCE:
                return new ezds();
            case NEW_BUILDER:
                return new ezdr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = j;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ezds.class) {
                    evsgVar = j;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        j = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
