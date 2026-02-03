package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewjp extends evsn implements evui {
    public static final ewjp a;
    private static volatile evuo j;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i = "";

    static {
        ewjp ewjpVar = new ewjp();
        a = ewjpVar;
        evsn.registerDefaultInstance(ewjp.class, ewjpVar);
    }

    private ewjp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", ewjn.a, "d", "e", ewjj.a, "f", ewgw.a, "g", "h", ewjl.a, "i"});
        }
        if (iOrdinal == 3) {
            return new ewjp();
        }
        if (iOrdinal == 4) {
            return new ewji();
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
        synchronized (ewjp.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
