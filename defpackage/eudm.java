package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudm extends evsn implements evui {
    public static final eudm a;
    private static volatile evuo h;
    public int b;
    public efvz d;
    public evrw e;
    public int f;
    public boolean g;
    private byte i = 2;
    public String c = "";

    static {
        eudm eudmVar = new eudm();
        a = eudmVar;
        evsn.registerDefaultInstance(eudm.class, eudmVar);
    }

    private eudm() {
        emptyIntList();
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001Ȉ\u0002ᐉ\u0000\u0003ဉ\u0001\u0004\f\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new eudm();
            case NEW_BUILDER:
                return new eudl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eudm.class) {
                    evsgVar = h;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        h = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
