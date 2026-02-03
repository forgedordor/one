package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgw extends evsn implements evui {
    public static final ejgw a;
    private static volatile evuo e;
    public String b = "";
    public int c;
    public boolean d;

    static {
        ejgw ejgwVar = new ejgw();
        a = ejgwVar;
        evsn.registerDefaultInstance(ejgw.class, ejgwVar);
    }

    private ejgw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejgw();
        }
        if (iOrdinal == 4) {
            return new ejgu();
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
        synchronized (ejgw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
