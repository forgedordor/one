package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejw extends evsn implements evui {
    public static final fejw a;
    private static volatile evuo k;
    public int b;
    public long c;
    public evvp e;
    public evrj f;
    public fejq g;
    public int h;
    public boolean i;
    public float j;
    private byte l = 2;
    public evtg d = emptyProtobufList();

    static {
        fejw fejwVar = new fejw();
        a = fejwVar;
        evsn.registerDefaultInstance(fejw.class, fejwVar);
    }

    private fejw() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0001\u0001\u0001စ\u0000\u0003Л\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007᠌\u0004\bဇ\u0005\fခ\u0006", new Object[]{"b", "c", "d", fejt.class, "e", "f", "g", "h", fejv.a, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new fejw();
            case NEW_BUILDER:
                return new feju();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fejw.class) {
                    evsgVar = k;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        k = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
