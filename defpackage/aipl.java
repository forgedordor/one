package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aipl extends evsn implements evui {
    public static final aipl a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;
    private int f;

    static {
        aipl aiplVar = new aipl();
        a = aiplVar;
        evsn.registerDefaultInstance(aipl.class, aiplVar);
    }

    private aipl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000\u0003င\u0000", new Object[]{"c", "b", "f", elle.a, emxs.a, "d"});
        }
        if (iOrdinal == 3) {
            return new aipl();
        }
        if (iOrdinal == 4) {
            return new aipk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aipl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
