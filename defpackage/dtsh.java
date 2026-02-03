package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtsh extends evsn implements evui {
    public static final dtsh a;
    private static volatile evuo i;
    public int b;
    public int d;
    public boolean e;
    public long f;
    public int h;
    public String c = "";
    public String g = "";

    static {
        dtsh dtshVar = new dtsh();
        a = dtshVar;
        evsn.registerDefaultInstance(dtsh.class, dtshVar);
    }

    private dtsh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005᠌\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"b", "c", "d", dtrt.a, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new dtsh();
        }
        if (iOrdinal == 4) {
            return new dtsg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dtsh.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
