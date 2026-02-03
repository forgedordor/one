package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqko extends evsn implements evui {
    public static final eqko a;
    private static volatile evuo k;
    public evvp d;
    public evvp e;
    public evvp f;
    public long g;
    public ewue h;
    public String i;
    public String j;
    private int l;
    private byte m = 2;
    public String b = "";
    public String c = "";

    static {
        eqko eqkoVar = new eqko();
        a = eqkoVar;
        evsn.registerDefaultInstance(eqko.class, eqkoVar);
    }

    private eqko() {
        evqs evqsVar = evqs.b;
        this.i = "";
        this.j = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\r\t\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u0002\bᐉ\u0003\u000bȈ\fȈ\rဉ\u0002", new Object[]{"l", "b", "c", "d", "e", "g", "h", "i", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new eqko();
            case NEW_BUILDER:
                return new eqkn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eqko.class) {
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
