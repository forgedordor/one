package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewgn extends evsn implements evui {
    public static final ewgn a;
    private static volatile evuo g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        ewgn ewgnVar = new ewgn();
        a = ewgnVar;
        evsn.registerDefaultInstance(ewgn.class, ewgnVar);
    }

    private ewgn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", ewgm.a, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ewgn();
        }
        if (iOrdinal == 4) {
            return new ewgl();
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
        synchronized (ewgn.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
