package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exxw extends evsi implements evsj {
    public static final exxw a;
    private static volatile evuo c;
    public exxu b;
    private int d;
    private exxm e;
    private exyh f;
    private exxk g;
    private exya h;
    private byte i = 2;

    static {
        exxw exxwVar = new exxw();
        a = exxwVar;
        evsn.registerDefaultInstance(exxw.class, exxwVar);
    }

    private exxw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u001c\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0007ᐉ\t\nဉ\u0011\u001cဉ\u001c", new Object[]{"d", "e", "b", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new exxw();
            case NEW_BUILDER:
                return new exxv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = c;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (exxw.class) {
                    evsgVar = c;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        c = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
