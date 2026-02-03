package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engg extends evsn implements evui {
    public static final engg a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        engg enggVar = new engg();
        a = enggVar;
        evsn.registerDefaultInstance(engg.class, enggVar);
    }

    private engg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001h\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"d", "c", "b", "e", engl.a, "f", "g", engi.class, engo.class, enge.class, engk.class});
        }
        if (iOrdinal == 3) {
            return new engg();
        }
        if (iOrdinal == 4) {
            return new engf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (engg.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
