package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgf extends evsn implements evui {
    public static final etgf a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        etgf etgfVar = new etgf();
        a = etgfVar;
        evsn.registerDefaultInstance(etgf.class, etgfVar);
    }

    private etgf() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u083f\u0000\u0002;\u0000\u0003ဈ\u0000\u0004;\u0000\u0005ဈ\u0001\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", esxf.a, "e", "f", etgj.class, etgh.class});
        }
        if (iOrdinal == 3) {
            return new etgf();
        }
        if (iOrdinal == 4) {
            return new etge();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etgf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
