package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwq extends evsn implements evui {
    public static final elwq a;
    private static volatile evuo m;
    public int b;
    public elrz c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public emfr i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        elwq elwqVar = new elwq();
        a = elwqVar;
        evsn.registerDefaultInstance(elwq.class, elwqVar);
    }

    private elwq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\u0000\u0001ဉ\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\nဇ\b\u000b᠌\t\fဉ\n\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e", new Object[]{"b", "c", "d", elkd.a, "e", elwn.a, "f", eljy.a, "g", "h", elwo.a, "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new elwq();
        }
        if (iOrdinal == 4) {
            return new elwm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elwq.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
