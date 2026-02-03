package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augz extends evsn implements evui {
    public static final augz a;
    private static volatile evuo i;
    public int b;
    public aubl c;
    public evvp e;
    public boolean f;
    public augm g;
    public elpg h;
    private byte j = 2;
    public evqs d = evqs.b;

    static {
        augz augzVar = new augz();
        a = augzVar;
        evsn.registerDefaultInstance(augz.class, augzVar);
    }

    private augz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\nᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new augz();
            case NEW_BUILDER:
                return new augy();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (augz.class) {
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
