package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadm extends evsn implements evui {
    public static final eadm a;
    private static volatile evuo h;
    public String b = "";
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        eadm eadmVar = new eadm();
        a = eadmVar;
        evsn.registerDefaultInstance(eadm.class, eadmVar);
    }

    private eadm() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"i", "b", "c", "d", eryc.a, "e", "g", "f"});
        }
        if (iOrdinal == 3) {
            return new eadm();
        }
        if (iOrdinal == 4) {
            return new eadl();
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
        synchronized (eadm.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
