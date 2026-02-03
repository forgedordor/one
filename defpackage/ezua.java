package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezua extends evsn implements evui {
    public static final ezua a;
    private static volatile evuo h;
    public Object c;
    public int d;
    public int e;
    public int b = 0;
    public String f = "";
    public String g = "";

    static {
        ezua ezuaVar = new ezua();
        a = ezuaVar;
        evsn.registerDefaultInstance(ezua.class, ezuaVar);
    }

    private ezua() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0007<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", eztz.class});
        }
        if (iOrdinal == 3) {
            return new ezua();
        }
        if (iOrdinal == 4) {
            return new eztx();
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
        synchronized (ezua.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
