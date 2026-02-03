package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwy extends evsn implements evui {
    public static final emwy a;
    private static volatile evuo j;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public emxa f;
    public enof g;
    public emxe h;
    public int i;

    static {
        emwy emwyVar = new emwy();
        a = emwyVar;
        evsn.registerDefaultInstance(emwy.class, emwyVar);
    }

    private emwy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006<\u0000\u0007\u083f\u0000\b\u083f\u0000", new Object[]{"d", "c", "b", "e", emwv.a, "f", "g", "h", "i", exzm.class, emwx.a, emwu.a});
        }
        if (iOrdinal == 3) {
            return new emwy();
        }
        if (iOrdinal == 4) {
            return new emwt();
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
        synchronized (emwy.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
