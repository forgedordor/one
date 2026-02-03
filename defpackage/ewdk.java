package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewdk extends evsn implements evui {
    public static final ewdk a;
    private static volatile evuo i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        ewdk ewdkVar = new ewdk();
        a = ewdkVar;
        evsn.registerDefaultInstance(ewdk.class, ewdkVar);
    }

    private ewdk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0004<\u0000\u0005᠌\u0003", new Object[]{"d", "c", "b", "e", ewde.a, "f", "g", ewdi.a, ewdc.class, "h", ewdg.a});
        }
        if (iOrdinal == 3) {
            return new ewdk();
        }
        if (iOrdinal == 4) {
            return new ewdd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewdk.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
