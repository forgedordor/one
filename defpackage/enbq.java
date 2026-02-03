package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enbq extends evsn implements evui {
    public static final enbq a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public String f = "";

    static {
        enbq enbqVar = new enbq();
        a = enbqVar;
        evsn.registerDefaultInstance(enbq.class, enbqVar);
    }

    private enbq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u083f\u0000\u0004\u083f\u0000\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000", new Object[]{"d", "c", "b", "e", enbm.a, "f", enbg.a, enbk.a, enbe.a, enbi.a, enbo.a});
        }
        if (iOrdinal == 3) {
            return new enbq();
        }
        if (iOrdinal == 4) {
            return new enbd();
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
        synchronized (enbq.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
