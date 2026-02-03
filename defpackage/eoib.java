package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoib extends evsn implements evui {
    public static final eoib a;
    private static volatile evuo d;
    public int b;
    public long c;
    private int e;
    private int f;
    private byte g = 2;

    static {
        eoib eoibVar = new eoib();
        a = eoibVar;
        evsn.registerDefaultInstance(eoib.class, eoibVar);
    }

    private eoib() {
    }

    public static /* synthetic */ void a(eoib eoibVar) {
        eoibVar.b |= 4;
        eoibVar.f = 0;
    }

    public static /* synthetic */ void b(eoib eoibVar) {
        eoibVar.b |= 2;
        eoibVar.e = 0;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new eoib();
            case NEW_BUILDER:
                return new eoia();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = d;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eoib.class) {
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
