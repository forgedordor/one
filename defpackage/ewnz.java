package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewnz extends evsn implements evui {
    public static final ewnz a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        ewnz ewnzVar = new ewnz();
        a = ewnzVar;
        evsn.registerDefaultInstance(ewnz.class, ewnzVar);
    }

    private ewnz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဈ\u0002\b<\u0000\n<\u0000\u000b:\u0000\f<\u0000", new Object[]{"d", "c", "b", "e", "f", ewot.class, ewow.class, ewpk.class, ewfk.class, "g", ewqb.class, ewqh.class, ewpw.class});
        }
        if (iOrdinal == 3) {
            return new ewnz();
        }
        if (iOrdinal == 4) {
            return new ewny();
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
        synchronized (ewnz.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
