package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvh extends evsn implements evui {
    public static final dbvh a;
    private static volatile evuo n;
    public int b;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String l = "";
    public String m = "";

    static {
        dbvh dbvhVar = new dbvh();
        a = dbvhVar;
        evsn.registerDefaultInstance(dbvh.class, dbvhVar);
    }

    private dbvh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဈ\t\fဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", dbvf.a, "l", "m"});
        }
        if (iOrdinal == 3) {
            return new dbvh();
        }
        if (iOrdinal == 4) {
            return new dbve();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbvh.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
