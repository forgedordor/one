package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exgo extends evsn implements evui {
    public static final exgo a;
    private static volatile evuo g;
    public int b;
    public int c;
    public evsx d = emptyIntList();
    public String e = "";
    public String f = "";

    static {
        exgo exgoVar = new exgo();
        a = exgoVar;
        evsn.registerDefaultInstance(exgo.class, exgoVar);
    }

    private exgo() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exgo();
        }
        if (iOrdinal == 4) {
            return new exgn();
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
        synchronized (exgo.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
