package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dluj extends evsn implements evui {
    public static final dluj a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        dluj dlujVar = new dluj();
        a = dlujVar;
        evsn.registerDefaultInstance(dluj.class, dlujVar);
    }

    private dluj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000ÈÊ\u0003\u0000\u0000\u0000È<\u0000É<\u0000Ê<\u0000", new Object[]{"c", "b", dlui.class, dlud.class, dluf.class});
        }
        if (iOrdinal == 3) {
            return new dluj();
        }
        if (iOrdinal == 4) {
            return new dlub();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dluj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
