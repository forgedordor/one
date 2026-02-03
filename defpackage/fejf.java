package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejf extends evsn implements evui {
    public static final fejf a;
    private static volatile evuo i;
    public int b;
    public long c;
    public feeg d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    private byte j = 2;

    static {
        fejf fejfVar = new fejf();
        a = fejfVar;
        evsn.registerDefaultInstance(fejf.class, fejfVar);
    }

    private fejf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဃ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new fejf();
            case NEW_BUILDER:
                return new feje();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fejf.class) {
                    evsgVar = i;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        i = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
