package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokx extends evsn implements evui {
    public static final dokx a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public dluj e;
    public dltt f;
    public donb g;

    static {
        dokx dokxVar = new dokx();
        a = dokxVar;
        evsn.registerDefaultInstance(dokx.class, dokxVar);
    }

    private dokx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001dË\u0007\u0000\u0000\u0000dဉ\u0000eဉ\u0001fဉ\u0002È<\u0000É<\u0000Ê<\u0000Ë<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", dokp.class, doku.class, dokw.class, dokj.class});
        }
        if (iOrdinal == 3) {
            return new dokx();
        }
        if (iOrdinal == 4) {
            return new dokd();
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
        synchronized (dokx.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
