package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emca extends evsn implements evui {
    public static final emca a;
    private static volatile evuo j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private byte k = 2;
    public evtg h = emptyProtobufList();
    public String i = "";

    static {
        emca emcaVar = new emca();
        a = emcaVar;
        evsn.registerDefaultInstance(emca.class, emcaVar);
    }

    private emca() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0003\u0001ᴌ\u0000\u0002ᴌ\u0001\u0003᠌\u0002\u0004င\u0003\u0005ᴌ\u0004\b\u001b\tဈ\u0006", new Object[]{"b", "c", emcc.a, "d", emcl.a, "e", emcm.a, "f", "g", emcb.a, "h", emdf.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new emca();
            case NEW_BUILDER:
                return new embz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = j;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emca.class) {
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
