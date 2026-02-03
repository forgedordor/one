package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewxn extends evsn implements evui {
    public static final ewxn a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d;

    static {
        ewxn ewxnVar = new ewxn();
        a = ewxnVar;
        evsn.registerDefaultInstance(ewxn.class, ewxnVar);
    }

    private ewxn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", ewxm.a, "d"});
        }
        if (iOrdinal == 3) {
            return new ewxn();
        }
        if (iOrdinal == 4) {
            return new ewxl();
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
        synchronized (ewxn.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
