package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbw extends evsn implements evui {
    public static final ewbw a;
    private static volatile evuo k;
    public int b;
    public int c;
    public long e;
    public boolean f;
    public ewuw g;
    public boolean h;
    public int i;
    private byte l = 2;
    public evtg d = evsn.emptyProtobufList();
    public String j = "";

    static {
        ewbw ewbwVar = new ewbw();
        a = ewbwVar;
        evsn.registerDefaultInstance(ewbw.class, ewbwVar);
    }

    private ewbw() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ဇ\u0004\u0007᠌\u0005\bဈ\u0006", new Object[]{"b", "c", ewus.a, "d", "e", "f", "g", "h", "i", ewcf.a, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ewbw();
            case NEW_BUILDER:
                return new ewbv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewbw.class) {
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
