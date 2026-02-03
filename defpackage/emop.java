package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emop extends evsn implements evui {
    public static final emop a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public evrj i;
    public int c = 0;
    public int e = 0;
    public int g = 0;

    static {
        emop emopVar = new emop();
        a = emopVar;
        evsn.registerDefaultInstance(emop.class, emopVar);
    }

    private emop() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0003\u0001\u0002ĭ\u000e\u0000\u0000\u0000\u0002ဉ\u0000e<\u0000f<\u0000g<\u0000É<\u0001Ê<\u0001Ë<\u0001Ì<\u0001Í<\u0001Î<\u0001Ï<\u0001Ð<\u0001Ñ<\u0001ĭ<\u0002", new Object[]{"d", "c", "f", "e", "h", "g", "b", "i", emss.class, empl.class, emqs.class, emqu.class, empe.class, emqj.class, empn.class, emqm.class, emou.class, emor.class, empg.class, emqo.class, empi.class});
        }
        if (iOrdinal == 3) {
            return new emop();
        }
        if (iOrdinal == 4) {
            return new emoo();
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
        synchronized (emop.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
