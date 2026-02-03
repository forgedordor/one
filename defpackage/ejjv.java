package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjv extends evsn implements evui {
    public static final ejjv a;
    private static volatile evuo l;
    public int b;
    public ejib c;
    public ejjt d;
    public ejkh e;
    public ejkj f;
    public ejha g;
    public boolean h;
    public ejji i;
    public ejjz j;
    public ejjx k;
    private byte m = 2;

    static {
        ejjv ejjvVar = new ejjv();
        a = ejjvVar;
        evsn.registerDefaultInstance(ejjv.class, ejjvVar);
    }

    private ejjv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000b\t\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\bဇ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ejjv();
            case NEW_BUILDER:
                return new ejju();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = l;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ejjv.class) {
                    evsgVar = l;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        l = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
