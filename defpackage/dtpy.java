package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpy extends evsn implements evui {
    public static final dtpy a;
    private static volatile evuo i;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;

    static {
        dtpy dtpyVar = new dtpy();
        a = dtpyVar;
        evsn.registerDefaultInstance(dtpy.class, dtpyVar);
    }

    private dtpy() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0000\u0001ဈ\u0005\u0004ဈ\u0007\b᠌\u0000\tဈ\u0001\rဈ\u0006\u000eဂ\f", new Object[]{"b", "e", "g", "c", dtpx.a, "d", "f", "h"});
        }
        if (iOrdinal == 3) {
            return new dtpy();
        }
        if (iOrdinal == 4) {
            return new dtpw();
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
        synchronized (dtpy.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
