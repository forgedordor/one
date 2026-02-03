package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlq extends evsi implements evsj {
    public static final emlq a;
    private static volatile evuo h;
    public int b;
    public emlu c;
    public int d;
    public emlu e;
    public long f;
    public boolean g;
    private byte i = 2;

    static {
        emlq emlqVar = new emlq();
        a = emlqVar;
        evsn.registerDefaultInstance(emlq.class, emlqVar);
    }

    private emlq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", emlp.a, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new emlq();
            case NEW_BUILDER:
                return new emlo();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emlq.class) {
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
