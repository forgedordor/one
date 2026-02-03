package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnj extends evsn implements evui {
    public static final emnj a;
    private static volatile evuo k;
    public int b;
    public Object d;
    public int e;
    public emnl g;
    public int h;
    public int i;
    public int j;
    public int c = 0;
    public evqs f = evqs.b;

    static {
        emnj emnjVar = new emnj();
        a = emnjVar;
        evsn.registerDefaultInstance(emnj.class, emnjVar);
    }

    private emnj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0004ဉ\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000\bင\u0004\tင\u0005\n᠌\u0006", new Object[]{"d", "c", "b", "e", emnh.a, "f", "g", emns.class, emnn.class, emnq.class, "h", "i", "j", azuz.a});
        }
        if (iOrdinal == 3) {
            return new emnj();
        }
        if (iOrdinal == 4) {
            return new emni();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emnj.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
