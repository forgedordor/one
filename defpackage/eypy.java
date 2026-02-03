package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypy extends evsn implements evui {
    public static final eypy a;
    private static volatile evuo l;
    public int b;
    public eypv d;
    public eypp e;
    public eypj i;
    public eyqr j;
    public evub f = evub.a;
    public String c = "";
    public evtg g = emptyProtobufList();
    public evtg h = emptyProtobufList();
    public String k = "";

    static {
        eypy eypyVar = new eypy();
        a = eypyVar;
        evsn.registerDefaultInstance(eypy.class, eypyVar);
    }

    private eypy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0001\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u00042\u0006\u001b\u0007\u001b\bဉ\u0002\tဉ\u0003\nȈ", new Object[]{"b", "c", "d", "e", "f", eypx.a, "g", eyqd.class, "h", eyqd.class, "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new eypy();
        }
        if (iOrdinal == 4) {
            return new eypw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eypy.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
