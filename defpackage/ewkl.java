package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewkl extends evsn implements evui {
    public static final ewkl a;
    private static volatile evuo k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public String f = "";
    public evtg g = emptyProtobufList();
    public boolean h;
    public boolean i;
    public int j;

    static {
        ewkl ewklVar = new ewkl();
        a = ewklVar;
        evsn.registerDefaultInstance(ewkl.class, ewklVar);
    }

    private ewkl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005\u001b\nဇ\b\u000bဇ\t\rင\u000b", new Object[]{"b", "c", ewrx.a, "d", "e", ewrv.a, "f", "g", ewkj.class, "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ewkl();
        }
        if (iOrdinal == 4) {
            return new ewkk();
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
        synchronized (ewkl.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
