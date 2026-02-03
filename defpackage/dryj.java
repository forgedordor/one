package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryj extends evsi implements evsj {
    public static final dryj a;
    private static volatile evuo d;
    public int b;
    public long c;
    private byte e = 2;

    static {
        dryj dryjVar = new dryj();
        a = dryjVar;
        evsn.registerDefaultInstance(dryj.class, dryjVar);
    }

    private dryj() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new dryj();
            case NEW_BUILDER:
                return new dryi();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dryj.class) {
                    evsgVar = d;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        d = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
