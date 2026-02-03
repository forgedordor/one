package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fehu extends evsn implements evui {
    public static final fehu a;
    private static volatile evuo m;
    public int b;
    public boolean c;
    public fehb d;
    public int g;
    public eoin i;
    public exay j;
    public fehy k;
    public fehs l;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        fehu fehuVar = new fehu();
        a = fehuVar;
        evsn.registerDefaultInstance(fehu.class, fehuVar);
    }

    private fehu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", feht.a, "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new fehu();
            case NEW_BUILDER:
                return new feho();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = m;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (fehu.class) {
                    evsgVar = m;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        m = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}
