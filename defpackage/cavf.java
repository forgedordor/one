package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavf extends evsn implements evui {
    public static final cavf a;
    private static volatile evuo i;
    public int b;
    public int d;
    public long e;
    public elpg f;
    public long g;
    public long h;
    private byte j = 2;
    public String c = "";

    static {
        cavf cavfVar = new cavf();
        a = cavfVar;
        evsn.registerDefaultInstance(cavf.class, cavfVar);
    }

    private cavf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0004\u0002ᔈ\u0000\u0003ᔄ\u0001\u0004ᔂ\u0002\u0007ᐉ\u0003\bဂ\u0004\tဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new cavf();
            case NEW_BUILDER:
                return new cave();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (cavf.class) {
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
