package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emky extends evsn implements evui {
    public static final emky a;
    private static volatile evuo i;
    public int b;
    public eohz c;
    public eohz e;
    public emmv f;
    public emls g;
    public emla h;
    private eohz j;
    private byte k = 2;
    public evtg d = emptyProtobufList();

    static {
        emky emkyVar = new emky();
        a = emkyVar;
        evsn.registerDefaultInstance(emky.class, emkyVar);
    }

    private emky() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", emmz.class, "e", "f", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new emky();
            case NEW_BUILDER:
                return new emkx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emky.class) {
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
