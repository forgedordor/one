package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auhf extends evsn implements evui {
    public static final auhf a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public auib g;
    public aubq h;
    public aubq i;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        auhf auhfVar = new auhf();
        a = auhfVar;
        evsn.registerDefaultInstance(auhf.class, auhfVar);
    }

    private auhf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဈ\u0001\tဉ\u0002\n<\u0000\u000bဉ\u0003\fဉ\u0004\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", augu.class, auhd.class, auhb.class, auhl.class, auhz.class, auhx.class, "f", "g", auhv.class, "h", "i", auhq.class, auhn.class, auht.class});
        }
        if (iOrdinal == 3) {
            return new auhf();
        }
        if (iOrdinal == 4) {
            return new auhe();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auhf.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
