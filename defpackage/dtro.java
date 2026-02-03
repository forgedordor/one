package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtro extends evsn implements evui {
    public static final dtro a;
    private static volatile evuo i;
    public int b;
    public dtrw c;
    public long d;
    public String e = "";
    public int f;
    public long g;
    public long h;

    static {
        dtro dtroVar = new dtro();
        a = dtroVar;
        evsn.registerDefaultInstance(dtro.class, dtroVar);
    }

    private dtro() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (iOrdinal == 3) {
            return new dtro();
        }
        if (iOrdinal == 4) {
            return new dtrn();
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
        synchronized (dtro.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
