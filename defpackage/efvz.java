package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvz extends evsn implements evui {
    public static final efvz a;
    private static volatile evuo j;
    public int b;
    public efwf d;
    public evtg i;
    private byte k = 2;
    public String c = "";
    public evtg e = emptyProtobufList();
    public String f = "";
    public evtg g = emptyProtobufList();
    public evtg h = emptyProtobufList();

    static {
        efvz efvzVar = new efvz();
        a = efvzVar;
        evsn.registerDefaultInstance(efvz.class, efvzVar);
    }

    private efvz() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.i = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u00012\u0007\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u001aဈ\u00020\u001b2\u001b", new Object[]{"b", "c", "d", "g", efvx.class, "h", efwh.class, "f", "e", efwk.class, "i", efvq.class});
            case NEW_MUTABLE_INSTANCE:
                return new efvz();
            case NEW_BUILDER:
                return new efvy();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = j;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (efvz.class) {
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
