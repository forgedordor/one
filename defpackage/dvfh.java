package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfh extends evsn implements evui {
    public static final dvfh a;
    private static volatile evuo h;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    private int i;

    static {
        dvfh dvfhVar = new dvfh();
        a = dvfhVar;
        evsn.registerDefaultInstance(dvfh.class, dvfhVar);
    }

    private dvfh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new dvfh();
        }
        if (iOrdinal == 4) {
            return new dvfg();
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
        synchronized (dvfh.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
