package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhe extends evsn implements evui {
    public static final elhe a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public elgu e;
    public int f;
    public long g;
    private byte k = 2;
    private int j = -1;
    public String h = "";

    static {
        elhe elheVar = new elhe();
        a = elheVar;
        evsn.registerDefaultInstance(elhe.class, elheVar);
    }

    private elhe() {
    }

    public static /* synthetic */ void a(elhe elheVar) {
        elheVar.b |= 2;
        elheVar.j = 1;
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007ለ\u0006", new Object[]{"b", "c", "j", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new elhe();
            case NEW_BUILDER:
                return new elhd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (elhe.class) {
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
