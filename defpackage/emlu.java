package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlu extends evsn implements evui {
    public static final emlu a;
    private static volatile evuo f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    private byte g = 2;

    static {
        emlu emluVar = new emlu();
        a = emluVar;
        evsn.registerDefaultInstance(emlu.class, emluVar);
    }

    private emlu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001м\u0000\u0002м\u0001\u0003м\u0000\u0004;\u0000\u0005;\u0001", new Object[]{"c", "b", "e", "d", eoib.class, eohx.class, eohz.class});
            case NEW_MUTABLE_INSTANCE:
                return new emlu();
            case NEW_BUILDER:
                return new emlt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emlu.class) {
                    evsgVar = f;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        f = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
