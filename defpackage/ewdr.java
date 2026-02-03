package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewdr extends evsn implements evui {
    public static final ewdr a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        ewdr ewdrVar = new ewdr();
        a = ewdrVar;
        evsn.registerDefaultInstance(ewdr.class, ewdrVar);
    }

    private ewdr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0013\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\t᠌\u0006\n᠌\u0007\u0013᠌\t", new Object[]{"b", "c", "d", "e", ewqv.a, "f", ewqw.a, "g", ewqx.a, "h", ewdq.a});
        }
        if (iOrdinal == 3) {
            return new ewdr();
        }
        if (iOrdinal == 4) {
            return new ewdp();
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
        synchronized (ewdr.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
