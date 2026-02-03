package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgf extends evsn implements evui {
    public static final evgf a;
    private static volatile evuo i;
    public int b;
    public evbp c;
    public evhj d;
    private byte j = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public boolean h = true;

    static {
        evgf evgfVar = new evgf();
        a = evgfVar;
        evsn.registerDefaultInstance(evgf.class, evgfVar);
    }

    private evgf() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new evgf();
            case NEW_BUILDER:
                return new evge();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (evgf.class) {
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
