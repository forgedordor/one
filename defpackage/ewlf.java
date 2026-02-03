package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewlf extends evsn implements evui {
    public static final ewlf a;
    private static volatile evuo i;
    public int b;
    public Object d;
    public int e;
    public int h;
    public int c = 0;
    public String f = "";
    public String g = "";

    static {
        ewlf ewlfVar = new ewlf();
        a = ewlfVar;
        evsn.registerDefaultInstance(ewlf.class, ewlfVar);
    }

    private ewlf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004᠌\u0000\u0005ဈ\u0001\u0006ဈ\u0002\u0007᠌\u0003", new Object[]{"d", "c", "b", ewlp.class, ewlr.class, ewlc.class, "e", ewle.a, "f", "g", "h", ewrl.a});
        }
        if (iOrdinal == 3) {
            return new ewlf();
        }
        if (iOrdinal == 4) {
            return new ewld();
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
        synchronized (ewlf.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
