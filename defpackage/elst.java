package defpackage;

import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elst extends evsn implements evui {
    public static final elst a;
    private static volatile evuo f;
    public int b;
    public int c;
    public ScytaleLoggingProto$ScytaleEvent d;
    public int e;
    private byte g = 2;

    static {
        elst elstVar = new elst();
        a = elstVar;
        evsn.registerDefaultInstance(elst.class, elstVar);
    }

    private elst() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᔉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", elsr.a, "d", "e", elvf.a});
            case NEW_MUTABLE_INSTANCE:
                return new elst();
            case NEW_BUILDER:
                return new elsq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = f;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (elst.class) {
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
