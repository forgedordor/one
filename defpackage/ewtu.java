package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewtu extends evsn implements evui {
    public static final ewtu a;
    private static volatile evuo b;
    private int c;
    private long e;
    private long f;
    private ewts g;
    private ewts h;
    private byte i = 2;
    private String d = "";

    static {
        ewtu ewtuVar = new ewtu();
        a = ewtuVar;
        evsn.registerDefaultInstance(ewtu.class, ewtuVar);
    }

    private ewtu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔈ\u0000\u0002ᔂ\u0001\u0003ᔂ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ewtu();
            case NEW_BUILDER:
                return new ewtt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = b;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ewtu.class) {
                    evsgVar = b;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        b = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
