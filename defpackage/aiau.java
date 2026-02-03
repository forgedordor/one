package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiau extends evsn implements evui {
    public static final aiau a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public long f;
    public int c = 0;
    public evqs e = evqs.b;

    static {
        aiau aiauVar = new aiau();
        a = aiauVar;
        evsn.registerDefaultInstance(aiau.class, aiauVar);
    }

    private aiau() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဂ\u0001\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", aiak.class, aiat.class, aiap.class, aiam.class, "f", aiar.class, aiai.class});
        }
        if (iOrdinal == 3) {
            return new aiau();
        }
        if (iOrdinal == 4) {
            return new aiag();
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
        synchronized (aiau.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
